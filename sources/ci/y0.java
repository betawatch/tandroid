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
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c10;
import org.telegram.ui.dp;
import org.telegram.ui.fp;
import org.telegram.ui.jn;
import org.telegram.ui.n80;
import org.telegram.ui.np;
import org.telegram.ui.op;
import org.telegram.ui.qw;
import org.telegram.ui.rh;
import org.telegram.ui.ry;
import org.telegram.ui.sp;
import org.telegram.ui.xn;
import org.telegram.ui.zz;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                v3 v3Var = (v3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = v3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    v3Var.h = messages_botresults.next_offset;
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
                    v3Var.d = false;
                    v3Var.F(false);
                    v3Var.l();
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
                ii.x3 x3Var = (ii.x3) obj2;
                ii.p5 p5Var = (ii.p5) obj;
                boolean z11 = !z10;
                ii.r5 r5Var = p5Var.v;
                Iterator it = p5Var.H.iterator();
                while (it.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    ii.s5 m10 = r5Var.m(pagetablecell);
                    if (m10 == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii.i6.h(pagetablecell));
                        boolean z12 = spannableStringBuilder.length() > 0 && (ii.g6.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0;
                        ii.i6.l(pagetablecell, z11);
                        if (!z10 && spannableStringBuilder.length() > 0) {
                            ii.g6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z10 && z12) {
                            ii.g6.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        ii.i6.d(pagetablecell, spannableStringBuilder);
                    } else if (m10.b != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10.a.getText());
                        boolean z13 = spannableStringBuilder2.length() > 0 && (ii.g6.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0;
                        ii.i6.l(m10.b, z11);
                        if (z10) {
                            if (z13) {
                                ii.g6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            ii.g6.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        ii.i6.d(m10.b, spannableStringBuilder2);
                        m10.b(m10.b);
                    }
                }
                r5Var.invalidate();
                ii.d3 d3Var = p5Var.E;
                if (d3Var != null && p5Var.a != null) {
                    d3Var.a();
                }
                x3Var.M2();
                return;
            case 6:
                ii.w3 w3Var = (ii.w3) obj;
                w3Var.f.o3(true);
                ii.k4.k((org.telegram.ui.ActionBar.n2) obj2, z10, new ii.h4(w3Var, i12));
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
                if (view instanceof org.telegram.ui.ActionBar.j5) {
                    org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) view;
                    if (j5Var.a) {
                        j5Var.a = false;
                        j5Var.invalidate();
                    }
                }
                if (z10) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                int i18 = c6Var.a;
                if (arrayList10 != null && (arrayList = org.telegram.ui.ActionBar.h6.I.b0) != null && !arrayList.isEmpty() && arrayList10.contains(org.telegram.ui.ActionBar.h6.I.k(false))) {
                    org.telegram.ui.ActionBar.h6.o1(true);
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
            case 11:
                ((xn) obj2).rc((MessageObject) obj, z10);
                return;
            case 12:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (f6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.f6 k10 = g6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, g6Var, Boolean.FALSE, null, Integer.valueOf(f6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.h6.j0(g6Var, k10, true);
                    return;
                }
                return;
            case 13:
                TLObject tLObject2 = (TLObject) obj;
                xn xnVar = ((jn) obj2).a;
                xnVar.zb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    org.telegram.ui.Components.xc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (xnVar.getParentActivity() == null || xnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    ux0 ux0Var = new ux0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.Y, xnVar.ea);
                    ux0Var.setCalcMandatoryInsets(xnVar.x9());
                    xnVar.showDialog(ux0Var);
                    return;
                } else {
                    ArrayList arrayList11 = new ArrayList(1);
                    arrayList11.add(tL_inputStickerSetID);
                    tv tvVar = new tv(xnVar, xnVar.getParentActivity(), xnVar.ea, arrayList11);
                    tvVar.setCalcMandatoryInsets(xnVar.x9());
                    xnVar.showDialog(tvVar);
                    return;
                }
            case 14:
                dp dpVar = (dp) obj2;
                fp fpVar = dpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getContext(), 0, fpVar.p2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.R = string;
                b2Var2.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(dpVar, (TLRPC.TL_username) obj, z10, 5));
                alertDialog$Builder.o();
                return;
            case 15:
                op opVar = (op) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                sp spVar = opVar.x.d;
                spVar.O = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                spVar.P = true;
                spVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new np(opVar, i13), new rh(16, opVar, chat));
                return;
            case 16:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((wi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(i13, editTextBoldCursor));
                    return;
                }
                return;
            case 18:
                ((d10) obj2).R((a10) obj, !z10);
                return;
            case 19:
                ca0 ca0Var = (ca0) obj2;
                ca0Var.getMessagesController().getStoriesController().o0(ca0Var.e, (ArrayList) obj, this.b, null);
                return;
            case 20:
                sd0 sd0Var = (sd0) obj2;
                bc0 bc0Var = (bc0) obj;
                if (z10) {
                    bc0Var.x(true);
                } else {
                    bc0Var.y();
                }
                sd0Var.b(bc0Var);
                return;
            case 21:
                i2 i2Var = (i2) obj2;
                bc0 bc0Var2 = (bc0) obj;
                if (z10) {
                    bc0Var2.x(true);
                } else {
                    bc0Var2.y();
                }
                ((sd0) i2Var.b).b(bc0Var2);
                return;
            case 22:
                zg0 zg0Var = (zg0) obj2;
                d61 d61Var = zg0Var.c;
                ArrayList arrayList12 = (ArrayList) obj;
                if (z10) {
                    arrayList12 = zg0Var.e;
                }
                if (arrayList12.isEmpty()) {
                    return;
                }
                if (d61Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < d61Var.getChildCount(); i19++) {
                        if (!(d61Var.getChildAt(i19) instanceof u00)) {
                        }
                    }
                    return;
                }
                zg0Var.a(false);
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
                ((qw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new c10((MessagesController.DialogFilter) obj, null));
                return;
            case 25:
                ArrayList arrayList13 = (ArrayList) obj;
                ry ryVar = ((qw) obj2).b;
                int i20 = 0;
                for (int i21 = 0; i21 < arrayList13.size(); i21++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList13.get(i21);
                    if (dialog != null) {
                        ryVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i20++;
                    }
                }
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(ryVar.getParentActivity(), null);
                ybVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i20, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i20, new Object[0]));
                if (z10) {
                    ybVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ybVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                org.telegram.ui.Components.qc.g(ryVar, ybVar, 1500).j();
                return;
            case 26:
                ((zz) obj2).Z((a10) obj, !z10);
                return;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new n80(languageSelectActivity, i13), 10L);
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
