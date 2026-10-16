package di;

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
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aq;
import org.telegram.ui.fo;
import org.telegram.ui.h00;
import org.telegram.ui.k10;
import org.telegram.ui.kp;
import org.telegram.ui.mp;
import org.telegram.ui.qn;
import org.telegram.ui.u80;
import org.telegram.ui.up;
import org.telegram.ui.vp;
import org.telegram.ui.wp;
import org.telegram.ui.xw;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x0(ig.y yVar, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = yVar;
        this.c = messagesStorage;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:296:0x0550, code lost:
    
        if (r5 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0650, code lost:
    
        if (r5 == null) goto L310;
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
        int i12 = 4;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 0;
        int i14 = 1;
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
                            z0 z0Var = new z0(byteBufferValue);
                            z0Var.a = longValue;
                            arrayList2.add(z0Var);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            arrayList3.add(Long.valueOf(longValue));
                        }
                        byteBufferValue.reuse();
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList3.size() > 0) {
                    while (i13 < arrayList3.size()) {
                        database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i13)).stepThis().dispose();
                        i13++;
                    }
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new bi.u8(25, callback, arrayList2));
                return;
            case 1:
                u3 u3Var = (u3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = u3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    u3Var.h = messages_botresults.next_offset;
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
                    u3Var.d = false;
                    u3Var.F(false);
                    u3Var.l();
                    return;
                }
                return;
            case 2:
                ig.y yVar = (ig.y) obj;
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
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    break;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new t1(yVar, arrayList5, arrayList6, arrayList7, this.b, 2));
                return;
            case 3:
                ((ii.b) obj2).Q((Utilities.Callback) obj, z10, false);
                return;
            case 4:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 5:
                ji.x3 x3Var = (ji.x3) obj2;
                ji.u5 u5Var = (ji.u5) obj;
                boolean z11 = !z10;
                ji.w5 w5Var = u5Var.v;
                Iterator it = u5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ji.x5 m10 = w5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ji.m6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ji.k6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ji.m6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ji.k6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ji.k6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ji.m6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ji.k6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ji.m6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ji.k6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ji.k6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ji.m6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                w5Var.invalidate();
                ji.d3 d3Var = u5Var.E;
                if (d3Var != null && u5Var.a != null) {
                    d3Var.a();
                }
                x3Var.N2();
                return;
            case 6:
                ji.w3 w3Var = (ji.w3) obj;
                w3Var.f.p3(true);
                ji.l4.k((org.telegram.ui.ActionBar.m2) obj2, z10, new ji.i4(w3Var, 2));
                return;
            case 7:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 8:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.i5) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
                    if (i5Var.a) {
                        i5Var.a = false;
                        i5Var.invalidate();
                    }
                }
                if (z10) {
                    a2Var.dismiss();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i18 = b6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.g6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.g6.I.k(false))) {
                    org.telegram.ui.ActionBar.g6.p1(true);
                }
                if (!z10) {
                    HashMap hashMap = b6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i18).removeObserver(b6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i18).removeObserver(b6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (b6Var.b != null) {
                    NotificationCenter.getInstance(i18).addObserver(b6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i18).addObserver(b6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = b6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i18).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.a6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 11:
                ((fo) obj2).vc((MessageObject) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (e6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.e6 k10 = f6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, Integer.valueOf(e6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.g6.k0(f6Var, k10, true);
                    return;
                }
                return;
            case 13:
                TLObject tLObject2 = (TLObject) obj;
                fo foVar = ((qn) obj2).a;
                foVar.Ab.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (foVar.getParentActivity() == null || foVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    uy0 uy0Var = new uy0(foVar.getParentActivity(), foVar, tL_inputStickerSetID, null, foVar.Y, foVar.ea);
                    uy0Var.setCalcMandatoryInsets(foVar.C9());
                    foVar.showDialog(uy0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    ew ewVar = new ew(foVar, foVar.getParentActivity(), foVar.ea, arrayList11);
                    ewVar.setCalcMandatoryInsets(foVar.C9());
                    foVar.showDialog(ewVar);
                    return;
                }
            case 14:
                kp kpVar = (kp) obj2;
                mp mpVar = kpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getContext(), 0, mpVar.n2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
                a2Var2.R = string;
                a2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(kpVar, (TLRPC.TL_username) obj, z10, i12));
                alertDialog$Builder.o();
                return;
            case 15:
                wp wpVar = (wp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                aq aqVar = wpVar.x.d;
                aqVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                aqVar.P = true;
                aqVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new up(wpVar, i14), new vp(i13, wpVar, chat));
                return;
            case 16:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 17:
                vi viVar = (vi) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!viVar.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    viVar.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new vp(16, viVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ((o10) obj2).S((l10) obj, !z10);
                return;
            case 19:
                cb0 cb0Var = (cb0) obj2;
                cb0Var.getMessagesController().getStoriesController().o0(cb0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 20:
                re0 re0Var = (re0) obj2;
                cd0 cd0Var = (cd0) obj;
                if (z10) {
                    cd0Var.x(true);
                } else {
                    cd0Var.y();
                }
                re0Var.b(cd0Var);
                return;
            case 21:
                h2 h2Var = (h2) obj2;
                cd0 cd0Var2 = (cd0) obj;
                if (z10) {
                    cd0Var2.x(true);
                } else {
                    cd0Var2.y();
                }
                ((re0) h2Var.b).b(cd0Var2);
                return;
            case 22:
                zh0 zh0Var = (zh0) obj2;
                i71 i71Var = zh0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = zh0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (i71Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < i71Var.getChildCount(); i19++) {
                        if (!(i71Var.getChildAt(i19) instanceof f10)) {
                        }
                    }
                    return;
                }
                zh0Var.a(false);
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
                ((xw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new k10((MessagesController.DialogFilter) obj, null));
                return;
            case 25:
                ArrayList arrayList13 = (ArrayList) obj;
                yy yyVar = ((xw) obj2).b;
                int i20 = 0;
                for (int i21 = 0; i21 < arrayList13.size(); i21++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i21);
                    if (dialog != null) {
                        yyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i20++;
                    }
                }
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(yyVar.getParentActivity(), null);
                acVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i20, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i20, new Object[0]));
                if (z10) {
                    acVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    acVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.sc.g(yyVar, acVar, 1500).j();
                return;
            case 26:
                ((h00) obj2).Z((l10) obj, !z10);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new u80(languageSelectActivity, 1), 10L);
                return;
            case 28:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.m2) obj, z10, false);
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

    public /* synthetic */ x0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ x0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
