package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((h01) obj).b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.e1, 0, true, new ci.cb(true, profileActivity, 2));
                break;
            case 1:
                l01 l01Var = (l01) obj;
                l01Var.M0(l01Var.getTabProgress());
                break;
            case 2:
                ((c11) obj).c();
                break;
            case 3:
                ((q11) obj).a();
                break;
            case 4:
                n11 n11Var = (n11) obj;
                n11Var.f.add(n11Var.c);
                n11Var.a();
                break;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 6:
                ((ai.x8) obj).e();
                break;
            case 7:
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
            case 8:
                ((l41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                s41 s41Var = (s41) obj;
                s41Var.dismiss();
                nf.f.s(s41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.al0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 12:
                i51 i51Var = ((h51) obj).a;
                i51Var.Q = true;
                i51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((v61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.l61 l61Var = ((q71) obj).i0;
                if (l61Var != null) {
                    l61Var.N(true);
                    break;
                }
                break;
            case 16:
                ((j71) obj).a();
                break;
            case 17:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 18:
                ((ff1) obj).J.r.l();
                break;
            case 19:
                ((nf1) obj).b.C0();
                break;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 21:
                ((hi1) obj).a.H();
                break;
            case 22:
                ((ii1) obj).a.H();
                break;
            case 23:
                si1 si1Var = ((gi1) obj).b;
                si1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                si1Var.Y.setCornerRadius(-1.0f);
                si1Var.c0.d.release();
                si1Var.d0.d.release();
                si1Var.b0.release();
                si1Var.l();
                si1Var.u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                si1Var.E0 = false;
                si1.n1 = null;
                break;
            case 24:
                qi1 qi1Var = (qi1) obj;
                qi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (qi1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 25:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.i0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
