package bi;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.yi;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e00;
import org.telegram.ui.eo;
import org.telegram.ui.jp;
import org.telegram.ui.lp;
import org.telegram.ui.pn;
import org.telegram.ui.q80;
import org.telegram.ui.qh;
import org.telegram.ui.tp;
import org.telegram.ui.up;
import org.telegram.ui.vw;
import org.telegram.ui.wy;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c1(gg.b0 b0Var, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = b0Var;
        this.c = messagesStorage;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:282:0x053e, code lost:
    
        if (r5 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x063e, code lost:
    
        if (r5 == null) goto L303;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase database;
        ArrayList arrayList;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 1;
        boolean z10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    break;
                }
                if (database == null) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                StringBuilder sb2 = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                sb2.append(z10 ? "2" : "0 OR type = 1");
                sb2.append(" ORDER BY date DESC");
                sQLiteCursor = database.queryFinalized(sb2.toString(), new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        try {
                            e1 e1Var = new e1(byteBufferValue);
                            e1Var.a = longValue;
                            arrayList2.add(e1Var);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            arrayList3.add(Long.valueOf(longValue));
                        }
                        byteBufferValue.reuse();
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList3.size() > 0) {
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i14)).stepThis().dispose();
                    }
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new a1.e(10, callback, arrayList2));
                return;
            case 1:
                o4 o4Var = (o4) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = o4Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    o4Var.h = messages_botresults.next_offset;
                    if (z10) {
                        arrayList4.clear();
                    }
                    for (int i15 = 0; i15 < messages_botresults.results.size(); i15++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i15);
                        TLRPC.Document document = botInlineResult.document;
                        if (document != null) {
                            arrayList4.add(document);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList4.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList4.add(botInlineResult);
                            }
                        }
                    }
                    o4Var.d = false;
                    o4Var.F(false);
                    o4Var.l();
                    return;
                }
                return;
            case 2:
                gg.b0 b0Var = (gg.b0) obj;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj2;
                ArrayList arrayList5 = new ArrayList();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                try {
                    try {
                        sQLiteCursor = messagesStorage2.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(0);
                            arrayList5.add(TL_account.TL_businessChatLink.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false));
                        }
                        sQLiteCursor.dispose();
                        ArrayList<Long> arrayList8 = new ArrayList<>();
                        ArrayList arrayList9 = new ArrayList();
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList5.get(i16);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i17 = 0; i17 < tL_businessChatLink.entities.size(); i17++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i17);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList8.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            messagesStorage2.getUsersInternal(arrayList8, arrayList6);
                        }
                        if (!arrayList9.isEmpty()) {
                            messagesStorage2.getChatsInternal(TextUtils.join(",", arrayList9), arrayList7);
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        break;
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new e2(b0Var, arrayList5, arrayList6, arrayList7, this.b, 2));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 3:
                ((gi.b) obj2).P((Utilities.Callback) obj, z10, false);
                return;
            case 4:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 5:
                hi.z3 z3Var = (hi.z3) obj2;
                hi.r5 r5Var = (hi.r5) obj;
                boolean z11 = !z10;
                hi.t5 t5Var = r5Var.v;
                Iterator it = r5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    hi.u5 m10 = t5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hi.l6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (hi.i6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        hi.l6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            hi.i6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            hi.i6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        hi.l6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (hi.i6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        hi.l6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                hi.i6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            hi.i6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        hi.l6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                t5Var.invalidate();
                hi.f3 f3Var = r5Var.E;
                if (f3Var != null && r5Var.a != null) {
                    f3Var.a();
                }
                z3Var.L2();
                return;
            case 6:
                hi.y3 y3Var = (hi.y3) obj;
                y3Var.f.n3(true);
                hi.m4.k((org.telegram.ui.ActionBar.p2) obj2, z10, new hi.j4(y3Var, i12));
                return;
            case 7:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 8:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 9:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.m5) {
                    org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) view;
                    if (m5Var.a) {
                        m5Var.a = false;
                        m5Var.invalidate();
                    }
                }
                if (z10) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i18 = e6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.j6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.j6.I.k(false))) {
                    org.telegram.ui.ActionBar.j6.o1(true);
                }
                if (!z10) {
                    HashMap hashMap = e6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i18).removeObserver(e6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i18).removeObserver(e6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (e6Var.b != null) {
                    NotificationCenter.getInstance(i18).addObserver(e6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i18).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = e6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i18).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.d6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 11:
                ((eo) obj2).rc((MessageObject) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (h6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.h6 k10 = i6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, Integer.valueOf(h6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.j6.j0(i6Var, k10, true);
                    return;
                }
                return;
            case 13:
                TLObject tLObject2 = (TLObject) obj;
                eo eoVar = ((pn) obj2).a;
                eoVar.Ab.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (eoVar.getParentActivity() == null || eoVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    hy0 hy0Var = new hy0(eoVar.getParentActivity(), eoVar, tL_inputStickerSetID, null, eoVar.Y, eoVar.ea);
                    hy0Var.setCalcMandatoryInsets(eoVar.x9());
                    eoVar.showDialog(hy0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    wv wvVar = new wv(eoVar, eoVar.getParentActivity(), eoVar.ea, arrayList11);
                    wvVar.setCalcMandatoryInsets(eoVar.x9());
                    eoVar.showDialog(wvVar);
                    return;
                }
            case 14:
                jp jpVar = (jp) obj2;
                lp lpVar = jpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getContext(), 0, lpVar.p2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                d2Var2.R = string;
                d2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(jpVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.o();
                return;
            case 15:
                up upVar = (up) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yp ypVar = upVar.x.d;
                ypVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                ypVar.P = true;
                ypVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new tp(upVar, i13), new qh(19, upVar, chat));
                return;
            case 16:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((yi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s1(i13, editTextBoldCursor));
                    return;
                }
                return;
            case 18:
                ((k10) obj2).R((h10) obj, !z10);
                return;
            case 19:
                la0 la0Var = (la0) obj2;
                la0Var.getMessagesController().getStoriesController().o0(la0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 20:
                be0 be0Var = (be0) obj2;
                lc0 lc0Var = (lc0) obj;
                if (z10) {
                    lc0Var.x(true);
                } else {
                    lc0Var.y();
                }
                be0Var.b(lc0Var);
                return;
            case 21:
                u2 u2Var = (u2) obj2;
                lc0 lc0Var2 = (lc0) obj;
                if (z10) {
                    lc0Var2.x(true);
                } else {
                    lc0Var2.y();
                }
                ((be0) u2Var.b).b(lc0Var2);
                return;
            case 22:
                ih0 ih0Var = (ih0) obj2;
                r61 r61Var = ih0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = ih0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (r61Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < r61Var.getChildCount(); i19++) {
                        if (!(r61Var.getChildAt(i19) instanceof a10)) {
                        }
                    }
                    return;
                }
                ih0Var.a(false);
                return;
            case 23:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                if (z10) {
                    tVar.x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.C0 = null;
                return;
            case 24:
                ((vw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new org.telegram.ui.h10((MessagesController.DialogFilter) obj, null));
                return;
            case 25:
                ArrayList arrayList13 = (ArrayList) obj;
                wy wyVar = ((vw) obj2).b;
                int i20 = 0;
                for (int i21 = 0; i21 < arrayList13.size(); i21++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i21);
                    if (dialog != null) {
                        wyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i20++;
                    }
                }
                org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(wyVar.getParentActivity(), null);
                xbVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i20, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i20, new Object[0]));
                if (z10) {
                    xbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    xbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.pc.g(wyVar, xbVar, 1500).j();
                return;
            case 26:
                ((e00) obj2).Z((h10) obj, !z10);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new q80(languageSelectActivity, i13), 10L);
                return;
            case 28:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.p2) obj, z10, false);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                BetaUpdate betaUpdate = (BetaUpdate) obj;
                Pattern pattern2 = LaunchActivity.B1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z10 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.O);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c1(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ c1(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
