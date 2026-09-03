package lh;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a00;
import org.telegram.ui.c10;
import org.telegram.ui.cp;
import org.telegram.ui.ep;
import org.telegram.ui.fn0;
import org.telegram.ui.j80;
import org.telegram.ui.ln;
import org.telegram.ui.mp;
import org.telegram.ui.mq0;
import org.telegram.ui.np;
import org.telegram.ui.op;
import org.telegram.ui.qw;
import org.telegram.ui.qy;
import org.telegram.ui.rm0;
import org.telegram.ui.sp;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r5(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 3;
        int i15 = 1;
        boolean z4 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i12) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z4), (String) obj);
                break;
            case 1:
                ((kh.h5) obj2).run(Boolean.valueOf(z4), (String) obj);
                break;
            case 2:
                ((dh.v) obj2).run(Boolean.valueOf(z4), (String) obj);
                break;
            case 3:
                ((CameraController) obj2).lambda$initCamera$4(z4, (Runnable) obj);
                break;
            case 4:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z4);
                break;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.l5) {
                    org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
                    if (l5Var.a) {
                        l5Var.a = false;
                        l5Var.invalidate();
                    }
                }
                if (z4) {
                    d2Var.dismiss();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i16 = e6Var.a;
                if (arrayList2 != null && (arrayList = org.telegram.ui.ActionBar.j6.I.Y) != null && !arrayList.isEmpty() && arrayList2.contains(org.telegram.ui.ActionBar.j6.I.k(false))) {
                    org.telegram.ui.ActionBar.j6.o1(true);
                }
                if (z4) {
                    if (e6Var.b != null) {
                        NotificationCenter.getInstance(i16).addObserver(e6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i16).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                        Iterator it = e6Var.b.entrySet().iterator();
                        while (it.hasNext()) {
                            FileLoader.getInstance(i16).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.d6) ((Map.Entry) it.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                        }
                        break;
                    }
                } else {
                    HashMap hashMap = e6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i16).removeObserver(e6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i16).removeObserver(e6Var, NotificationCenter.fileLoadFailed);
                        break;
                    }
                }
                break;
            case 7:
                ((zn) obj2).rc((MessageObject) obj, z4);
                break;
            case 8:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (h6Var != null) {
                    org.telegram.ui.ActionBar.h6 k10 = i6Var.k(false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, Integer.valueOf(h6Var.a));
                    if (z4) {
                        org.telegram.ui.ActionBar.j6.j0(i6Var, k10, true);
                        break;
                    }
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
                    break;
                }
                break;
            case 9:
                TLObject tLObject = (TLObject) obj;
                zn znVar = ((ln) obj2).a;
                znVar.xb.b();
                if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
                    qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString(z4 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                    if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_inputStickerSetID.id = stickerSet.id;
                        if (z4) {
                            ArrayList arrayList3 = new ArrayList(1);
                            arrayList3.add(tL_inputStickerSetID);
                            lv lvVar = new lv(znVar, znVar.getParentActivity(), znVar.ba, arrayList3);
                            lvVar.setCalcMandatoryInsets(znVar.x9());
                            znVar.showDialog(lvVar);
                            break;
                        } else {
                            xx0 xx0Var = new xx0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.V, znVar.ba);
                            xx0Var.setCalcMandatoryInsets(znVar.x9());
                            znVar.showDialog(xx0Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                cp cpVar = (cp) obj2;
                ep epVar = cpVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getContext(), 0, epVar.m2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                d2Var2.O = string;
                d2Var2.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(cpVar, (TLRPC.TL_username) obj, z4, i13));
                alertDialog$Builder.o();
                break;
            case 11:
                op opVar = (op) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                sp spVar = opVar.x.d;
                spVar.L = false;
                if (!z4 && chat.join_request) {
                    chat.join_request = false;
                    spVar.M = true;
                    spVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new mp(opVar, i15), new np(i14, opVar, chat));
                    break;
                }
                break;
            case 12:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z4, (String) obj);
                break;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((li) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(i15, editTextBoldCursor));
                    break;
                }
                break;
            case 14:
                ((d10) obj2).R((a10) obj, !z4);
                break;
            case 15:
                ea0 ea0Var = (ea0) obj2;
                ea0Var.getMessagesController().getStoriesController().o0(ea0Var.e, (ArrayList) obj, this.b, null);
                break;
            case 16:
                wd0 wd0Var = (wd0) obj2;
                ec0 ec0Var = (ec0) obj;
                if (z4) {
                    ec0Var.x(true);
                } else {
                    ec0Var.y();
                }
                wd0Var.b(ec0Var);
                break;
            case 17:
                dh.c cVar = (dh.c) obj2;
                ec0 ec0Var2 = (ec0) obj;
                if (z4) {
                    ec0Var2.x(true);
                } else {
                    ec0Var2.y();
                }
                ((wd0) cVar.b).b(ec0Var2);
                break;
            case 18:
                fh0 fh0Var = (fh0) obj2;
                g61 g61Var = fh0Var.c;
                ArrayList arrayList4 = (ArrayList) obj;
                if (z4) {
                    arrayList4 = fh0Var.e;
                }
                if (!arrayList4.isEmpty()) {
                    if (g61Var.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < g61Var.getChildCount(); i17++) {
                            if (!(g61Var.getChildAt(i17) instanceof u00)) {
                            }
                        }
                        break;
                    }
                    fh0Var.a(false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                if (z4) {
                    tVar.x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.z0 = null;
                break;
            case 20:
                ((qw) obj2).b.presentFragment(z4 ? new FiltersSetupActivity() : new c10((MessagesController.DialogFilter) obj, null));
                break;
            case 21:
                ArrayList arrayList5 = (ArrayList) obj;
                qy qyVar = ((qw) obj2).b;
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i19);
                    if (dialog != null) {
                        qyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z4 ? 3 : 4);
                        i18++;
                    }
                }
                qb qbVar = new qb(qyVar.getParentActivity(), null);
                qbVar.b.setText(z4 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i18, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i18, new Object[0]));
                if (z4) {
                    qbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    qbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ic.g(qyVar, qbVar, 1500).j();
                break;
            case 22:
                ((a00) obj2).Z((a10) obj, !z4);
                break;
            case 23:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new j80(languageSelectActivity, i15), 10L);
                    break;
                }
                break;
            case 24:
                Pattern pattern = LaunchActivity.y1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.p2) obj, z4, false);
                break;
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                BetaUpdate betaUpdate = (BetaUpdate) obj;
                Pattern pattern2 = LaunchActivity.y1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update != null && !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    if (z4 || betaUpdate == null || update.higherThan(betaUpdate)) {
                        ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.L);
                        break;
                    }
                }
                break;
            case 26:
                fn0.Y((fn0) obj2, z4, (String) obj);
                break;
            case 27:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                fn0 fn0Var = ((rm0) obj2).e;
                if (!z4) {
                    fn0Var.N1(true, false);
                    if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                        fn0Var.A1(true);
                        break;
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        fn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        fn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    }
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                    UserConfig.getInstance(i11).resetSavedPassword();
                    fn0Var.K0 = 0;
                    fn0Var.R1();
                    ViewGroup[] viewGroupArr = fn0Var.W;
                    if (viewGroupArr != null && viewGroupArr[0].getVisibility() == 0) {
                        fn0Var.V[0].requestFocus();
                        AndroidUtilities.showKeyboard(fn0Var.V[0]);
                        break;
                    }
                }
                break;
            case 28:
                mq0.U((mq0) obj2, (TLObject) obj, z4);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                View view2 = (View) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!z4) {
                    photoViewer.getClass();
                    view2.setVisibility(8);
                }
                photoViewer.s3();
                break;
        }
    }

    public /* synthetic */ r5(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z4;
        this.c = obj2;
    }
}
