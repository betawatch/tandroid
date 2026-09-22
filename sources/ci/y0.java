package ci;

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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.c00;
import org.telegram.ui.f10;
import org.telegram.ui.hp;
import org.telegram.ui.jp;
import org.telegram.ui.nn;
import org.telegram.ui.q80;
import org.telegram.ui.rp;
import org.telegram.ui.sp;
import org.telegram.ui.tw;
import org.telegram.ui.uh;
import org.telegram.ui.uy;
import org.telegram.ui.wp;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y0(hg.a0 a0Var, MessagesStorage messagesStorage, boolean z10) {
        this.a = 2;
        this.d = a0Var;
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
                            a1 a1Var = new a1(byteBufferValue);
                            a1Var.a = longValue;
                            arrayList2.add(a1Var);
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
                AndroidUtilities.runOnUIThread(new ai.ba(14, callback, arrayList2));
                return;
            case 1:
                w3 w3Var = (w3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = w3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    w3Var.h = messages_botresults.next_offset;
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
                    w3Var.d = false;
                    w3Var.F(false);
                    w3Var.l();
                    return;
                }
                return;
            case 2:
                hg.a0 a0Var = (hg.a0) obj;
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
                    AndroidUtilities.runOnUIThread(new u1(a0Var, arrayList5, arrayList6, arrayList7, this.b, 2));
                    return;
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            case 3:
                ((hi.b) obj2).P((Utilities.Callback) obj, z10, false);
                return;
            case 4:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 5:
                ii.w3 w3Var2 = (ii.w3) obj2;
                ii.o5 o5Var = (ii.o5) obj;
                boolean z11 = !z10;
                ii.q5 q5Var = o5Var.v;
                Iterator it = o5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ii.r5 m10 = q5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.h6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ii.f6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ii.h6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ii.f6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ii.f6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ii.h6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ii.f6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ii.h6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ii.f6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ii.f6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ii.h6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                q5Var.invalidate();
                ii.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.a != null) {
                    c3Var.a();
                }
                w3Var2.M2();
                return;
            case 6:
                ii.v3 v3Var = (ii.v3) obj;
                v3Var.f.o3(true);
                ii.j4.k((org.telegram.ui.ActionBar.n2) obj2, z10, new ii.g4(v3Var, i12));
                return;
            case 7:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 8:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.k5) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
                    if (k5Var.a) {
                        k5Var.a = false;
                        k5Var.invalidate();
                    }
                }
                if (z10) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i18 = d6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.i6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.i6.I.k(false))) {
                    org.telegram.ui.ActionBar.i6.o1(true);
                }
                if (!z10) {
                    HashMap hashMap = d6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i18).removeObserver(d6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i18).removeObserver(d6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (d6Var.b != null) {
                    NotificationCenter.getInstance(i18).addObserver(d6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i18).addObserver(d6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = d6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i18).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.c6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 11:
                ((bo) obj2).rc((MessageObject) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (g6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.g6 k10 = h6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, Integer.valueOf(g6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.i6.j0(h6Var, k10, true);
                    return;
                }
                return;
            case 13:
                TLObject tLObject2 = (TLObject) obj;
                bo boVar = ((nn) obj2).a;
                boVar.zb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.vc.a0(boVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (boVar.getParentActivity() == null || boVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    vx0 vx0Var = new vx0(boVar.getParentActivity(), boVar, tL_inputStickerSetID, null, boVar.Y, boVar.ea);
                    vx0Var.setCalcMandatoryInsets(boVar.x9());
                    boVar.showDialog(vx0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    sv svVar = new sv(boVar, boVar.getParentActivity(), boVar.ea, arrayList11);
                    svVar.setCalcMandatoryInsets(boVar.x9());
                    boVar.showDialog(svVar);
                    return;
                }
            case 14:
                hp hpVar = (hp) obj2;
                jp jpVar = hpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jpVar.getContext(), 0, jpVar.p2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = string;
                b2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(hpVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.o();
                return;
            case 15:
                sp spVar = (sp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                wp wpVar = spVar.x.d;
                wpVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                wpVar.P = true;
                wpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new rp(spVar, i13), new uh(16, spVar, chat));
                return;
            case 16:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((vi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(i13, editTextBoldCursor));
                    return;
                }
                return;
            case 18:
                ((c10) obj2).R((z00) obj, !z10);
                return;
            case 19:
                ba0 ba0Var = (ba0) obj2;
                ba0Var.getMessagesController().getStoriesController().o0(ba0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 20:
                sd0 sd0Var = (sd0) obj2;
                cc0 cc0Var = (cc0) obj;
                if (z10) {
                    cc0Var.x(true);
                } else {
                    cc0Var.y();
                }
                sd0Var.b(cc0Var);
                return;
            case 21:
                i2 i2Var = (i2) obj2;
                cc0 cc0Var2 = (cc0) obj;
                if (z10) {
                    cc0Var2.x(true);
                } else {
                    cc0Var2.y();
                }
                ((sd0) i2Var.b).b(cc0Var2);
                return;
            case 22:
                yg0 yg0Var = (yg0) obj2;
                e61 e61Var = yg0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = yg0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (e61Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < e61Var.getChildCount(); i19++) {
                        if (!(e61Var.getChildAt(i19) instanceof t00)) {
                        }
                    }
                    return;
                }
                yg0Var.a(false);
                return;
            case 23:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                if (z10) {
                    uVar.x.removeView(uVar2);
                }
                uVar2.setVisibility(8);
                uVar.C0 = null;
                return;
            case 24:
                ((tw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new f10((MessagesController.DialogFilter) obj, null));
                return;
            case 25:
                ArrayList arrayList13 = (ArrayList) obj;
                uy uyVar = ((tw) obj2).b;
                int i20 = 0;
                for (int i21 = 0; i21 < arrayList13.size(); i21++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i21);
                    if (dialog != null) {
                        uyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i20++;
                    }
                }
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(uyVar.getParentActivity(), null);
                wbVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i20, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i20, new Object[0]));
                if (z10) {
                    wbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    wbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.oc.g(uyVar, wbVar, 1500).j();
                return;
            case 26:
                ((c00) obj2).Z((z00) obj, !z10);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new q80(languageSelectActivity, i13), 10L);
                return;
            case 28:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.n2) obj, z10, false);
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

    public /* synthetic */ y0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ y0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
    }
}
