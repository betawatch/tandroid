package hh;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q00;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dn;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.gw;
import org.telegram.ui.gy;
import org.telegram.ui.jp;
import org.telegram.ui.km0;
import org.telegram.ui.oz;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.uo;
import org.telegram.ui.wo;
import org.telegram.ui.xm0;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t5(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
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
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 4;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i12) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((gh.p5) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((cg.u0) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                                lh.z0 z0Var = new lh.z0(byteBufferValue);
                                z0Var.a = longValue;
                                arrayList2.add(z0Var);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                arrayList3.add(Long.valueOf(longValue));
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor.dispose();
                    if (arrayList3.size() > 0) {
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i15)).stepThis().dispose();
                        }
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new jh.p6(18, callback, arrayList2));
                    return;
                } catch (Throwable th) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            case 4:
                lh.o3 o3Var = (lh.o3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = o3Var.c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    o3Var.h = messages_botresults.next_offset;
                    if (z10) {
                        arrayList4.clear();
                    }
                    for (int i16 = 0; i16 < messages_botresults.results.size(); i16++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i16);
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
                    o3Var.d = false;
                    o3Var.F(false);
                    o3Var.l();
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
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.i5) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
                    if (i5Var.a) {
                        i5Var.a = false;
                        i5Var.invalidate();
                    }
                }
                if (z10) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                int i17 = b6Var.a;
                if (arrayList5 != null && (arrayList = org.telegram.ui.ActionBar.g6.I.X) != null && !arrayList.isEmpty() && arrayList5.contains(org.telegram.ui.ActionBar.g6.I.k(false))) {
                    org.telegram.ui.ActionBar.g6.o1(true);
                }
                if (!z10) {
                    HashMap hashMap = b6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i17).removeObserver(b6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i17).removeObserver(b6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (b6Var.b != null) {
                    NotificationCenter.getInstance(i17).addObserver(b6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i17).addObserver(b6Var, NotificationCenter.fileLoadFailed);
                    Iterator it = b6Var.b.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(i17).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.a6) ((Map.Entry) it.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 9:
                ((rn) obj2).rc((MessageObject) obj, z10);
                return;
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (e6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.e6 k10 = f6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, Integer.valueOf(e6Var.a));
                if (z10) {
                    org.telegram.ui.ActionBar.g6.j0(f6Var, k10, true);
                    return;
                }
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj;
                rn rnVar = ((dn) obj2).a;
                rnVar.wb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                if (rnVar.getParentActivity() == null || rnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.id = stickerSet.id;
                if (!z10) {
                    ex0 ex0Var = new ex0(rnVar.getParentActivity(), rnVar, tL_inputStickerSetID, null, rnVar.U, rnVar.aa);
                    ex0Var.setCalcMandatoryInsets(rnVar.x9());
                    rnVar.showDialog(ex0Var);
                    return;
                } else {
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(tL_inputStickerSetID);
                    cv cvVar = new cv(rnVar, rnVar.getParentActivity(), rnVar.aa, arrayList6);
                    cvVar.setCalcMandatoryInsets(rnVar.x9());
                    rnVar.showDialog(cvVar);
                    return;
                }
            case 12:
                uo uoVar = (uo) obj2;
                wo woVar = uoVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getContext(), 0, woVar.l2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                b2Var2.N = string;
                b2Var2.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new b5.d(uoVar, (TLRPC.TL_username) obj, z10, i13));
                alertDialog$Builder.o();
                return;
            case 13:
                fp fpVar = (fp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jp jpVar = fpVar.x.d;
                jpVar.K = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                jpVar.L = true;
                jpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new ep(fpVar, i14), new rd(28, fpVar, chat));
                return;
            case 14:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((gi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p1(i14, editTextBoldCursor));
                    return;
                }
                return;
            case 16:
                ((q00) obj2).R((n00) obj, !z10);
                return;
            case 17:
                o90 o90Var = (o90) obj2;
                o90Var.getMessagesController().getStoriesController().o0(o90Var.e, (ArrayList) obj, this.b, null);
                return;
            case 18:
                dd0 dd0Var = (dd0) obj2;
                nb0 nb0Var = (nb0) obj;
                if (z10) {
                    nb0Var.x(true);
                } else {
                    nb0Var.y();
                }
                dd0Var.b(nb0Var);
                return;
            case 19:
                ch.e eVar = (ch.e) obj2;
                nb0 nb0Var2 = (nb0) obj;
                if (z10) {
                    nb0Var2.x(true);
                } else {
                    nb0Var2.y();
                }
                ((dd0) eVar.b).b(nb0Var2);
                return;
            case 20:
                mg0 mg0Var = (mg0) obj2;
                k51 k51Var = mg0Var.c;
                ArrayList arrayList7 = (ArrayList) obj;
                if (z10) {
                    arrayList7 = mg0Var.e;
                }
                if (arrayList7.isEmpty()) {
                    return;
                }
                if (k51Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < k51Var.getChildCount(); i18++) {
                        if (!(k51Var.getChildAt(i18) instanceof h00)) {
                        }
                    }
                    return;
                }
                mg0Var.a(false);
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
                ((gw) obj2).b.presentFragment(z10 ? new FiltersSetupActivity() : new org.telegram.ui.q00((MessagesController.DialogFilter) obj, null));
                return;
            case 23:
                ArrayList arrayList8 = (ArrayList) obj;
                gy gyVar = ((gw) obj2).b;
                int i19 = 0;
                for (int i20 = 0; i20 < arrayList8.size(); i20++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i20);
                    if (dialog != null) {
                        gyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z10 ? 3 : 4);
                        i19++;
                    }
                }
                mb mbVar = new mb(gyVar.getParentActivity(), null);
                mbVar.b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i19, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i19, new Object[0]));
                if (z10) {
                    mbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    mbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ec.g(gyVar, mbVar, 1500).j();
                return;
            case 24:
                ((oz) obj2).Z((n00) obj, !z10);
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new z70(languageSelectActivity, i14), 10L);
                return;
            case 26:
                Pattern pattern = LaunchActivity.x1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.n2) obj, z10, false);
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
                xm0.Y((xm0) obj2, z10, (String) obj);
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                xm0 xm0Var = ((km0) obj2).e;
                if (!z10) {
                    xm0Var.N1(true, false);
                    if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                        xm0Var.A1(true);
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        xm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        xm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        return;
                    }
                }
                i11 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
                UserConfig.getInstance(i11).resetSavedPassword();
                xm0Var.J0 = 0;
                xm0Var.R1();
                ViewGroup[] viewGroupArr = xm0Var.V;
                if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                    return;
                }
                xm0Var.U[0].requestFocus();
                AndroidUtilities.showKeyboard(xm0Var.U[0]);
                return;
        }
    }

    public /* synthetic */ t5(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }
}
