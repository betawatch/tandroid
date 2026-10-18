package ai;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.dw;
import org.telegram.ui.en;
import org.telegram.ui.ey;
import org.telegram.ui.fp;
import org.telegram.ui.gh;
import org.telegram.ui.gp;
import org.telegram.ui.kp;
import org.telegram.ui.nz;
import org.telegram.ui.p00;
import org.telegram.ui.sn;
import org.telegram.ui.vo;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x7(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x0512, code lost:
    
        if (r6 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0614, code lost:
    
        if (r6 == null) goto L294;
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
        int i12 = 5;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((tc) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((org.telegram.ui.Wallet.s1) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        database = messagesStorage.getDatabase();
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
                                ei.z0 z0Var = new ei.z0(byteBufferValue);
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
                        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                            database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i14)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new ci.v7(23, callback, arrayList2));
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 4:
                ei.p3 p3Var = (ei.p3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = p3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    p3Var.h = messages_botresults.next_offset;
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
                    p3Var.d = false;
                    p3Var.F(false);
                    p3Var.l();
                    return;
                }
                return;
            case 5:
                ig.y yVar = (ig.y) obj2;
                MessagesStorage messagesStorage2 = (MessagesStorage) obj;
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
                AndroidUtilities.runOnUIThread(new ei.s1(yVar, arrayList5, arrayList6, arrayList7, this.b, 2));
                return;
            case 6:
                ((ji.a) obj2).Q((Utilities.Callback) obj, z10, false);
                return;
            case 7:
                ((Utilities.Callback2) obj2).run((Bitmap) obj, Boolean.valueOf(z10));
                return;
            case 8:
                ki.w3 w3Var = (ki.w3) obj2;
                ki.o5 o5Var = (ki.o5) obj;
                boolean z11 = !z10;
                ki.q5 q5Var = o5Var.v;
                Iterator it = o5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ki.r5 m10 = q5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ki.g6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ki.e6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ki.g6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ki.e6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ki.e6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ki.g6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ki.e6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ki.g6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ki.e6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ki.e6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ki.g6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                q5Var.invalidate();
                ki.c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.a != null) {
                    c3Var.a();
                }
                w3Var.N2();
                return;
            case 9:
                ki.v3 v3Var = (ki.v3) obj;
                v3Var.f.p3(true);
                ki.j4.k((org.telegram.ui.ActionBar.n2) obj2, z10, new ki.g4(v3Var, 2));
                return;
            case 10:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 11:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 12:
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
            case 13:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i18 = c6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.h6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.h6.I.k(false))) {
                    org.telegram.ui.ActionBar.h6.p1(true);
                }
                if (!z10) {
                    HashMap hashMap = c6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i18).removeObserver(c6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i18).removeObserver(c6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (c6Var.b != null) {
                    NotificationCenter.getInstance(i18).addObserver(c6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i18).addObserver(c6Var, NotificationCenter.fileLoadFailed);
                    Iterator it2 = c6Var.b.entrySet().iterator();
                    while (it2.hasNext()) {
                        FileLoader.getInstance(i18).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.b6) ((Map.Entry) it2.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 14:
                ((sn) obj2).vc((MessageObject) obj, z10);
                return;
            case 15:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (f6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.f6 k10 = g6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, Integer.valueOf(f6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.h6.k0(g6Var, k10, true);
                    return;
                }
                return;
            case 16:
                TLObject tLObject2 = (TLObject) obj;
                sn snVar = ((en) obj2).a;
                snVar.Ab.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (snVar.getParentActivity() == null || snVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    oy0 oy0Var = new oy0(snVar.getParentActivity(), snVar, tL_inputStickerSetID, null, snVar.Y, snVar.ea);
                    oy0Var.setCalcMandatoryInsets(snVar.C9());
                    snVar.showDialog(oy0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    aw awVar = new aw(snVar, snVar.getParentActivity(), snVar.ea, arrayList11);
                    awVar.setCalcMandatoryInsets(snVar.C9());
                    snVar.showDialog(awVar);
                    return;
                }
            case 17:
                vo voVar = (vo) obj2;
                xo xoVar = voVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getContext(), 0, xoVar.n2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = string;
                b2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new f4(voVar, (TLRPC.TL_username) obj, z10, i12));
                alertDialog$Builder.o();
                return;
            case 18:
                gp gpVar = (gp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                kp kpVar = gpVar.x.d;
                kpVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                kpVar.P = true;
                kpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new fp(gpVar, i13), new gh(19, gpVar, chat));
                return;
            case 19:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 20:
                ti tiVar = (ti) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (!tiVar.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.isShown()) {
                    tiVar.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i12, tiVar, editTextBoldCursor));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((k10) obj2).S((h10) obj, !z10);
                return;
            case 22:
                wa0 wa0Var = (wa0) obj2;
                wa0Var.getMessagesController().getStoriesController().o0(wa0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 23:
                le0 le0Var = (le0) obj2;
                wc0 wc0Var = (wc0) obj;
                if (z10) {
                    wc0Var.w(true);
                } else {
                    wc0Var.x();
                }
                le0Var.b(wc0Var);
                return;
            case 24:
                u uVar = (u) obj2;
                wc0 wc0Var2 = (wc0) obj;
                if (z10) {
                    wc0Var2.w(true);
                } else {
                    wc0Var2.x();
                }
                ((le0) uVar.b).b(wc0Var2);
                return;
            case 25:
                th0 th0Var = (th0) obj2;
                a71 a71Var = th0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = th0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (a71Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < a71Var.getChildCount(); i19++) {
                        if (!(a71Var.getChildAt(i19) instanceof b10)) {
                        }
                    }
                    return;
                }
                th0Var.a(false);
                return;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                if (z10) {
                    tVar.x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.C0 = null;
                return;
            case 27:
                ((dw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new p00((MessagesController.DialogFilter) obj, null));
                return;
            case 28:
                ArrayList arrayList13 = (ArrayList) obj;
                ey eyVar = ((dw) obj2).b;
                int i20 = 0;
                for (int i21 = 0; i21 < arrayList13.size(); i21++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i21);
                    if (dialog != null) {
                        eyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i20++;
                    }
                }
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(eyVar.getParentActivity(), null);
                ybVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i20, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i20, new Object[0]));
                if (z10) {
                    ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.qc.g(eyVar, ybVar, 1500).j();
                return;
            default:
                ((nz) obj2).Z((h10) obj, !z10);
                return;
        }
    }

    public /* synthetic */ x7(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
