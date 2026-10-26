package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ my0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 1:
                qy0 qy0Var = (qy0) obj;
                qy0Var.G.getNotificationCenter().onAnimationFinish(qy0Var.F);
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) ((bh.p) obj).c;
                if (profileActivity.t5 != 1.0f) {
                    zy0 zy0Var = profileActivity.n0;
                    while (zy0Var.D0.k(i11) != zy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    zy0Var.x(i11, true);
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity2 = ((rz0) obj).b;
                int i13 = ProfileActivity.R6;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.e1, 0, true, new fi.ga(2, profileActivity2, true));
                break;
            case 4:
                vz0 vz0Var = (vz0) obj;
                vz0Var.T0(vz0Var.getTabProgress());
                break;
            case 5:
                ((m01) obj).c();
                break;
            case 6:
                ((b11) obj).a();
                break;
            case 7:
                y01 y01Var = (y01) obj;
                y01Var.f.add(y01Var.c);
                y01Var.a();
                break;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 9:
                ((di.v6) obj).e();
                break;
            case 10:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) obj;
                if (LaunchActivity.U() != null) {
                    if (wcVar == null) {
                        wcVar = org.telegram.ui.Components.wc.b0(LaunchActivity.U());
                    }
                    if (wcVar != null) {
                        org.telegram.ui.Components.qc M = wcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 11:
                ((e31) obj).invalidate();
                break;
            case 12:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.b0();
                break;
            case 13:
                m31 m31Var = (m31) obj;
                m31Var.dismiss();
                qf.d.r(m31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 14:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ll0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 15:
                c41 c41Var = ((b41) obj).a;
                c41Var.Q = true;
                c41Var.N.invalidate();
                break;
            case 16:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 17:
                AndroidUtilities.updateViewShow(((r51) obj).c, true);
                break;
            case 18:
                org.telegram.ui.Components.j71 j71Var = ((m61) obj).i0;
                if (j71Var != null) {
                    j71Var.O(true);
                    break;
                }
                break;
            case 19:
                ((f61) obj).a();
                break;
            case 20:
                jg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 21:
                w91 w91Var = (w91) obj;
                w91Var.m0.a(w91Var.j0.e0, w91Var.k0.isAttachedToWindow());
                break;
            case 22:
                ((ce1) obj).J.r.l();
                break;
            case 23:
                ((ke1) obj).b.C0();
                break;
            case 24:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 25:
                ((eh1) obj).a.G();
                break;
            case 26:
                ((fh1) obj).a.G();
                break;
            case 27:
                ph1 ph1Var = ((dh1) obj).b;
                ph1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ph1Var.Y.setCornerRadius(-1.0f);
                ph1Var.c0.d.release();
                ph1Var.d0.d.release();
                ph1Var.b0.release();
                ph1Var.k();
                ph1Var.u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                ph1Var.E0 = false;
                ph1.n1 = null;
                break;
            case 28:
                nh1 nh1Var = (nh1) obj;
                nh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (nh1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            default:
                ((VoIPPermissionActivity) obj).finish();
                break;
        }
    }
}
