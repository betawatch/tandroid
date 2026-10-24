package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                ny0 ny0Var = (ny0) obj;
                ny0Var.G.getNotificationCenter().onAnimationFinish(ny0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).c;
                if (profileActivity.p5 != 1.0f) {
                    wy0 wy0Var = profileActivity.o0;
                    while (wy0Var.D0.k(i11) != wy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    wy0Var.x(i11, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((nz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f1, 0, true, new ei.ka(2, profileActivity2, true));
                break;
            case 3:
                rz0 rz0Var = (rz0) obj;
                rz0Var.P0(rz0Var.getTabProgress());
                break;
            case 4:
                ((i01) obj).c();
                break;
            case 5:
                ((x01) obj).a();
                break;
            case 6:
                u01 u01Var = (u01) obj;
                u01Var.f.add(u01Var.c);
                u01Var.a();
                break;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 8:
                ((ci.v6) obj).e();
                break;
            case 9:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj;
                if (LaunchActivity.U() != null) {
                    if (xcVar == null) {
                        xcVar = org.telegram.ui.Components.xc.a0(LaunchActivity.U());
                    }
                    if (xcVar != null) {
                        org.telegram.ui.Components.qc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 10:
                ((b31) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.a0();
                break;
            case 12:
                l31 l31Var = (l31) obj;
                l31Var.dismiss();
                pf.d.r(l31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ql0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 14:
                b41 b41Var = ((a41) obj).a;
                b41Var.Q = true;
                b41Var.N.invalidate();
                break;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 16:
                AndroidUtilities.updateViewShow(((q51) obj).c, true);
                break;
            case 17:
                org.telegram.ui.Components.b71 b71Var = ((l61) obj).i0;
                if (b71Var != null) {
                    b71Var.N(true);
                    break;
                }
                break;
            case 18:
                ((e61) obj).a();
                break;
            case 19:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                ((zd1) obj).J.r.l();
                break;
            case 21:
                ((he1) obj).b.B0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((dh1) obj).a.G();
                break;
            case 24:
                ((eh1) obj).a.G();
                break;
            case 25:
                oh1 oh1Var = ((ch1) obj).b;
                oh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                oh1Var.Y.setCornerRadius(-1.0f);
                oh1Var.c0.d.release();
                oh1Var.d0.d.release();
                oh1Var.b0.release();
                oh1Var.k();
                oh1Var.u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                oh1Var.E0 = false;
                oh1.n1 = null;
                break;
            case 26:
                mh1 mh1Var = (mh1) obj;
                mh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (mh1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
