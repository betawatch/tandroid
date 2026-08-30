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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ap;
import org.telegram.ui.b10;
import org.telegram.ui.cp;
import org.telegram.ui.dn0;
import org.telegram.ui.fq0;
import org.telegram.ui.h80;
import org.telegram.ui.hp;
import org.telegram.ui.jn;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.ow;
import org.telegram.ui.oy;
import org.telegram.ui.pm0;
import org.telegram.ui.qp;
import org.telegram.ui.xn;
import org.telegram.ui.yz;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i14 = 1;
        boolean z4 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i12) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z4), (String) obj);
                break;
            case 1:
                ((kh.i5) obj2).run(Boolean.valueOf(z4), (String) obj);
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
                int i15 = e6Var.a;
                if (arrayList2 != null && (arrayList = org.telegram.ui.ActionBar.j6.I.Y) != null && !arrayList.isEmpty() && arrayList2.contains(org.telegram.ui.ActionBar.j6.I.k(false))) {
                    org.telegram.ui.ActionBar.j6.o1(true);
                }
                if (z4) {
                    if (e6Var.b != null) {
                        NotificationCenter.getInstance(i15).addObserver(e6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i15).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                        Iterator it = e6Var.b.entrySet().iterator();
                        while (it.hasNext()) {
                            FileLoader.getInstance(i15).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.d6) ((Map.Entry) it.next()).getValue()).a.document), "wallpaper", null, 0, 1);
                        }
                        break;
                    }
                } else {
                    HashMap hashMap = e6Var.b;
                    if (hashMap == null || hashMap.isEmpty()) {
                        NotificationCenter.getInstance(i15).removeObserver(e6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i15).removeObserver(e6Var, NotificationCenter.fileLoadFailed);
                        break;
                    }
                }
                break;
            case 7:
                ((xn) obj2).rc((MessageObject) obj, z4);
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
                xn xnVar = ((jn) obj2).a;
                xnVar.xb.b();
                if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
                    qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString(z4 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    break;
                } else {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(i10).putStickerSet(tL_messages_stickerSet, false);
                    if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_inputStickerSetID.id = stickerSet.id;
                        if (z4) {
                            ArrayList arrayList3 = new ArrayList(1);
                            arrayList3.add(tL_inputStickerSetID);
                            mv mvVar = new mv(xnVar, xnVar.getParentActivity(), xnVar.ba, arrayList3);
                            mvVar.setCalcMandatoryInsets(xnVar.x9());
                            xnVar.showDialog(mvVar);
                            break;
                        } else {
                            xx0 xx0Var = new xx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.ba);
                            xx0Var.setCalcMandatoryInsets(xnVar.x9());
                            xnVar.showDialog(xx0Var);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ap apVar = (ap) obj2;
                cp cpVar = apVar.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getContext(), 0, cpVar.m2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.a;
                d2Var2.O = string;
                d2Var2.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(apVar, (TLRPC.TL_username) obj, z4, i13));
                alertDialog$Builder.o();
                break;
            case 11:
                mp mpVar = (mp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qp qpVar = mpVar.x.d;
                qpVar.L = false;
                if (!z4 && chat.join_request) {
                    chat.join_request = false;
                    qpVar.M = true;
                    qpVar.getMessagesController().toggleChatJoinRequest(chat.id, false, new lp(mpVar, i14), new hp(i13, mpVar, chat));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(i14, editTextBoldCursor));
                    break;
                }
                break;
            case 14:
                ((c10) obj2).R((z00) obj, !z4);
                break;
            case 15:
                da0 da0Var = (da0) obj2;
                da0Var.getMessagesController().getStoriesController().o0(da0Var.e, (ArrayList) obj, this.b, null);
                break;
            case 16:
                vd0 vd0Var = (vd0) obj2;
                dc0 dc0Var = (dc0) obj;
                if (z4) {
                    dc0Var.x(true);
                } else {
                    dc0Var.y();
                }
                vd0Var.b(dc0Var);
                break;
            case 17:
                dh.c cVar = (dh.c) obj2;
                dc0 dc0Var2 = (dc0) obj;
                if (z4) {
                    dc0Var2.x(true);
                } else {
                    dc0Var2.y();
                }
                ((vd0) cVar.b).b(dc0Var2);
                break;
            case 18:
                eh0 eh0Var = (eh0) obj2;
                g61 g61Var = eh0Var.c;
                ArrayList arrayList4 = (ArrayList) obj;
                if (z4) {
                    arrayList4 = eh0Var.e;
                }
                if (!arrayList4.isEmpty()) {
                    if (g61Var.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < g61Var.getChildCount(); i16++) {
                            if (!(g61Var.getChildAt(i16) instanceof t00)) {
                            }
                        }
                        break;
                    }
                    eh0Var.a(false);
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
                ((ow) obj2).b.presentFragment(z4 ? new FiltersSetupActivity() : new b10((MessagesController.DialogFilter) obj, null));
                break;
            case 21:
                ArrayList arrayList5 = (ArrayList) obj;
                oy oyVar = ((ow) obj2).b;
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i18);
                    if (dialog != null) {
                        oyVar.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z4 ? 3 : 4);
                        i17++;
                    }
                }
                qb qbVar = new qb(oyVar.getParentActivity(), null);
                qbVar.b.setText(z4 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i17, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i17, new Object[0]));
                if (z4) {
                    qbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    qbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ic.g(oyVar, qbVar, 1500).j();
                break;
            case 22:
                ((yz) obj2).Z((z00) obj, !z4);
                break;
            case 23:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new h80(languageSelectActivity, i14), 10L);
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
                dn0.Y((dn0) obj2, z4, (String) obj);
                break;
            case 27:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                dn0 dn0Var = ((pm0) obj2).e;
                if (!z4) {
                    dn0Var.N1(true, false);
                    if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                        dn0Var.A1(true);
                        break;
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        dn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        dn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    }
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) dn0Var).currentAccount;
                    UserConfig.getInstance(i11).resetSavedPassword();
                    dn0Var.K0 = 0;
                    dn0Var.R1();
                    ViewGroup[] viewGroupArr = dn0Var.W;
                    if (viewGroupArr != null && viewGroupArr[0].getVisibility() == 0) {
                        dn0Var.V[0].requestFocus();
                        AndroidUtilities.showKeyboard(dn0Var.V[0]);
                        break;
                    }
                }
                break;
            case 28:
                fq0.U((fq0) obj2, (TLObject) obj, z4);
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
