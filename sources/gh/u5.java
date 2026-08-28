package gh;

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
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.cp;
import org.telegram.ui.dp;
import org.telegram.ui.dw;
import org.telegram.ui.dy;
import org.telegram.ui.hp;
import org.telegram.ui.jm0;
import org.telegram.ui.lz;
import org.telegram.ui.qn;
import org.telegram.ui.rd;
import org.telegram.ui.so;
import org.telegram.ui.uo;
import org.telegram.ui.v70;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u5(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x050c, code lost:
    
        if (r4 == null) goto L234;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteDatabase database;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11 = this.a;
        int i12 = 4;
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
                ((fh.w5) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((bg.y0) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        database = messagesStorage.getDatabase();
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
                                kh.a1 a1Var = new kh.a1(byteBufferValue);
                                a1Var.a = longValue;
                                arrayList2.add(a1Var);
                            } catch (Exception e11) {
                                FileLog.e(e11);
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
                    AndroidUtilities.runOnUIThread(new ih.j7(12, callback, arrayList2));
                    return;
                } catch (Throwable th) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            case 4:
                kh.p3 p3Var = (kh.p3) obj2;
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
                org.telegram.ui.ActionBar.a6 a6Var = (org.telegram.ui.ActionBar.a6) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                int i16 = a6Var.a;
                if (arrayList5 != null && (arrayList = org.telegram.ui.ActionBar.f6.I.X) != null && !arrayList.isEmpty() && arrayList5.contains(org.telegram.ui.ActionBar.f6.I.k(false))) {
                    org.telegram.ui.ActionBar.f6.o1(true);
                }
                if (!z10) {
                    HashMap hashMap = a6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i16).removeObserver(a6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i16).removeObserver(a6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (a6Var.b != null) {
                    NotificationCenter.getInstance(i16).addObserver(a6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i16).addObserver(a6Var, NotificationCenter.fileLoadFailed);
                    Iterator it = a6Var.b.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(i16).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.z5) ((Map.Entry) it.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 9:
                ((qn) obj2).rc((MessageObject) obj, z10);
                return;
            case 10:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (d6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, e6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.d6 k10 = e6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, e6Var, Boolean.FALSE, null, Integer.valueOf(d6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.f6.j0(e6Var, k10, true);
                    return;
                }
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj;
                qn qnVar = ((cn) obj2).a;
                qnVar.wb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i9).putStickerSet(tL_messages_stickerSet, false);
                if (qnVar.getParentActivity() == null || qnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    cx0 cx0Var = new cx0(qnVar.getParentActivity(), qnVar, tL_inputStickerSetID, null, qnVar.U, qnVar.aa);
                    cx0Var.setCalcMandatoryInsets(qnVar.x9());
                    qnVar.showDialog(cx0Var);
                    return;
                } else {
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(tL_inputStickerSetID);
                    dv dvVar = new dv(qnVar, qnVar.getParentActivity(), qnVar.aa, arrayList6);
                    dvVar.setCalcMandatoryInsets(qnVar.x9());
                    qnVar.showDialog(dvVar);
                    return;
                }
            case 12:
                so soVar = (so) obj2;
                uo uoVar = soVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar.getContext(), 0, uoVar.l2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                c2Var2.N = string;
                c2Var2.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new b5.e(soVar, (TLRPC.TL_username) obj, z10, i12));
                alertDialog$Builder.o();
                return;
            case 13:
                dp dpVar = (dp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                hp hpVar = dpVar.x.d;
                hpVar.K = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                hpVar.L = true;
                hpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new cp(dpVar, i13), new rd(28, dpVar, chat));
                return;
            case 14:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((ki) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p1(i13, editTextBoldCursor));
                    return;
                }
                return;
            case 16:
                ((n00) obj2).Q((k00) obj, !z10);
                return;
            case 17:
                k90 k90Var = (k90) obj2;
                k90Var.getMessagesController().getStoriesController().o0(k90Var.e, (ArrayList) obj, this.b, null);
                return;
            case 18:
                yc0 yc0Var = (yc0) obj2;
                jb0 jb0Var = (jb0) obj;
                if (z10) {
                    jb0Var.x(true);
                } else {
                    jb0Var.y();
                }
                yc0Var.b(jb0Var);
                return;
            case 19:
                bh.f fVar = (bh.f) obj2;
                jb0 jb0Var2 = (jb0) obj;
                if (z10) {
                    jb0Var2.x(true);
                } else {
                    jb0Var2.y();
                }
                ((yc0) fVar.b).b(jb0Var2);
                return;
            case 20:
                kg0 kg0Var = (kg0) obj2;
                i51 i51Var = kg0Var.c;
                ArrayList arrayList7 = (ArrayList) obj;
                if (z10) {
                    arrayList7 = kg0Var.e;
                }
                if (arrayList7.isEmpty()) {
                    return;
                }
                if (i51Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < i51Var.getChildCount(); i17++) {
                        if (!(i51Var.getChildAt(i17) instanceof e00)) {
                        }
                    }
                    return;
                }
                kg0Var.a(false);
                return;
            case 21:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                if (z10) {
                    tVar.x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.y0 = null;
                return;
            case 22:
                ((dw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new org.telegram.ui.n00((MessagesController.DialogFilter) obj, null));
                return;
            case 23:
                ArrayList arrayList8 = (ArrayList) obj;
                dy dyVar = ((dw) obj2).b;
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList8.size(); i19++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i19);
                    if (dialog != null) {
                        dyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i18++;
                    }
                }
                ob obVar = new ob(dyVar.getParentActivity(), null);
                obVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i18, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i18, new Object[0]));
                if (z10) {
                    obVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    obVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                gc.g(dyVar, obVar, 1500).j();
                return;
            case 24:
                ((lz) obj2).Y((k00) obj, !z10);
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new v70(languageSelectActivity, i13), 10L);
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
                wm0.X((wm0) obj2, z10, (String) obj);
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                wm0 wm0Var = ((jm0) obj2).e;
                if (!z10) {
                    wm0Var.N1(true, false);
                    if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                        wm0Var.A1(true);
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        wm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        wm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                UserConfig.getInstance(i10).resetSavedPassword();
                wm0Var.J0 = 0;
                wm0Var.R1();
                ViewGroup[] viewGroupArr = wm0Var.V;
                if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                    return;
                }
                wm0Var.U[0].requestFocus();
                AndroidUtilities.showKeyboard(wm0Var.U[0]);
                return;
        }
    }

    public /* synthetic */ u5(Object obj, boolean z10, Object obj2, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
