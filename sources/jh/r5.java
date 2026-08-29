package jh;

import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn;
import org.telegram.ui.fp;
import org.telegram.ui.fw;
import org.telegram.ui.fy;
import org.telegram.ui.gp;
import org.telegram.ui.hm0;
import org.telegram.ui.kp;
import org.telegram.ui.nz;
import org.telegram.ui.tn;
import org.telegram.ui.vf;
import org.telegram.ui.vm0;
import org.telegram.ui.vo;
import org.telegram.ui.xo;
import org.telegram.ui.y70;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r5(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x050f, code lost:
    
        if (r5 == null) goto L234;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase database;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 25;
        int i14 = 4;
        SQLiteCursor sQLiteCursor = null;
        int i15 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i12) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((ih.i5) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((bh.v) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                            nh.z0 z0Var = new nh.z0(byteBufferValue);
                            z0Var.a = longValue;
                            arrayList2.add(z0Var);
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            arrayList3.add(Long.valueOf(longValue));
                        }
                        byteBufferValue.reuse();
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList3.size() > 0) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i16)).stepThis().dispose();
                    }
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new lh.r3(i13, callback, arrayList2));
                return;
            case 4:
                nh.m3 m3Var = (nh.m3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = m3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    m3Var.h = messages_botresults.next_offset;
                    if (z10) {
                        arrayList4.clear();
                    }
                    for (int i17 = 0; i17 < messages_botresults.results.size(); i17++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
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
                    m3Var.d = false;
                    m3Var.F(false);
                    m3Var.l();
                    return;
                }
                return;
            case 5:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 6:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 7:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.i5) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
                    if (i5Var.a) {
                        i5Var.a = false;
                        i5Var.invalidate();
                    }
                }
                if (z10) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                int i18 = b6Var.a;
                if (arrayList5 != null && (arrayList = org.telegram.ui.ActionBar.g6.I.X) != null && !arrayList.isEmpty() && arrayList5.contains(org.telegram.ui.ActionBar.g6.I.k(false))) {
                    org.telegram.ui.ActionBar.g6.o1(true);
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
                    Iterator it = b6Var.b.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(i18).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.a6) ((Map.Entry) it.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 9:
                ((tn) obj2).rc((MessageObject) obj, z10);
                return;
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (e6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.e6 k9 = f6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, Integer.valueOf(e6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.g6.j0(f6Var, k9, true);
                    return;
                }
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj;
                tn tnVar = ((fn) obj2).a;
                tnVar.wb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (tnVar.getParentActivity() == null || tnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    nx0 nx0Var = new nx0(tnVar.getParentActivity(), tnVar, tL_inputStickerSetID, null, tnVar.U, tnVar.aa);
                    nx0Var.setCalcMandatoryInsets(tnVar.x9());
                    tnVar.showDialog(nx0Var);
                    return;
                } else {
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(tL_inputStickerSetID);
                    jv jvVar = new jv(tnVar, tnVar.getParentActivity(), tnVar.aa, arrayList6);
                    jvVar.setCalcMandatoryInsets(tnVar.x9());
                    tnVar.showDialog(jvVar);
                    return;
                }
            case 12:
                vo voVar = (vo) obj2;
                xo xoVar = voVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getContext(), 0, xoVar.l2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.N = string;
                c2Var2.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(voVar, (TLRPC.TL_username) obj, z10, i14));
                alertDialog$Builder.o();
                return;
            case 13:
                gp gpVar = (gp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                kp kpVar = gpVar.x.d;
                kpVar.K = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                kpVar.L = true;
                kpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new fp(gpVar, i15), new vf(i13, gpVar, chat));
                return;
            case 14:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((ni) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.s1(i15, editTextBoldCursor));
                    return;
                }
                return;
            case 16:
                ((y00) obj2).R((v00) obj, !z10);
                return;
            case 17:
                y90 y90Var = (y90) obj2;
                y90Var.getMessagesController().getStoriesController().o0(y90Var.e, (ArrayList) obj, this.b, null);
                return;
            case 18:
                nd0 nd0Var = (nd0) obj2;
                yb0 yb0Var = (yb0) obj;
                if (z10) {
                    yb0Var.x(true);
                } else {
                    yb0Var.y();
                }
                nd0Var.b(yb0Var);
                return;
            case 19:
                bh.c cVar = (bh.c) obj2;
                yb0 yb0Var2 = (yb0) obj;
                if (z10) {
                    yb0Var2.x(true);
                } else {
                    yb0Var2.y();
                }
                ((nd0) cVar.b).b(yb0Var2);
                return;
            case 20:
                ug0 ug0Var = (ug0) obj2;
                u51 u51Var = ug0Var.c;
                ArrayList arrayList7 = (ArrayList) obj;
                if (z10) {
                    arrayList7 = ug0Var.e;
                }
                if (arrayList7.isEmpty()) {
                    return;
                }
                if (u51Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < u51Var.getChildCount(); i19++) {
                        if (!(u51Var.getChildAt(i19) instanceof p00)) {
                        }
                    }
                    return;
                }
                ug0Var.a(false);
                return;
            case 21:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                if (z10) {
                    uVar.x.removeView(uVar2);
                }
                uVar2.setVisibility(8);
                uVar.y0 = null;
                return;
            case 22:
                ((fw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new org.telegram.ui.p00((MessagesController.DialogFilter) obj, null));
                return;
            case 23:
                ArrayList arrayList8 = (ArrayList) obj;
                fy fyVar = ((fw) obj2).b;
                int i20 = 0;
                for (int i21 = 0; i21 < arrayList8.size(); i21++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i21);
                    if (dialog != null) {
                        fyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i20++;
                    }
                }
                ub ubVar = new ub(fyVar.getParentActivity(), null);
                ubVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i20, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i20, new Object[0]));
                if (z10) {
                    ubVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    ubVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                mc.g(fyVar, ubVar, 1500).j();
                return;
            case 24:
                ((nz) obj2).Z((v00) obj, !z10);
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new y70(languageSelectActivity, i15), 10L);
                return;
            case 26:
                Pattern pattern = LaunchActivity.x1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.o2) obj, z10, false);
                return;
            case 27:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                BetaUpdate betaUpdate = (BetaUpdate) obj;
                Pattern pattern2 = LaunchActivity.x1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z10 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.K);
                    return;
                }
                return;
            case 28:
                vm0.Y((vm0) obj2, z10, (String) obj);
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                vm0 vm0Var = ((hm0) obj2).e;
                if (!z10) {
                    vm0Var.N1(true, false);
                    if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                        vm0Var.A1(true);
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        vm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        vm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                UserConfig.getInstance(i11).resetSavedPassword();
                vm0Var.J0 = 0;
                vm0Var.R1();
                ViewGroup[] viewGroupArr = vm0Var.V;
                if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                    return;
                }
                vm0Var.U[0].requestFocus();
                AndroidUtilities.showKeyboard(vm0Var.U[0]);
                return;
        }
    }

    public /* synthetic */ r5(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
