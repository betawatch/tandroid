package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((n01) obj).b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.e1, 0, true, new bi.lc(true, profileActivity, 2));
                break;
            case 1:
                r01 r01Var = (r01) obj;
                r01Var.M0(r01Var.getTabProgress());
                break;
            case 2:
                ((i11) obj).c();
                break;
            case 3:
                ((w11) obj).a();
                break;
            case 4:
                t11 t11Var = (t11) obj;
                t11Var.f.add(t11Var.c);
                t11Var.a();
                break;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 6:
                ((zh.w4) obj).e();
                break;
            case 7:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) obj;
                if (LaunchActivity.U() != null) {
                    if (wcVar == null) {
                        wcVar = org.telegram.ui.Components.wc.a0(LaunchActivity.U());
                    }
                    if (wcVar != null) {
                        org.telegram.ui.Components.pc M = wcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 8:
                ((r41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                x41 x41Var = (x41) obj;
                x41Var.dismiss();
                nf.f.s(x41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.vv0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 12:
                n51 n51Var = ((m51) obj).a;
                n51Var.Q = true;
                n51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((a71) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.j61 j61Var = ((v71) obj).i0;
                if (j61Var != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 16:
                ((o71) obj).a();
                break;
            case 17:
                gg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 18:
                ((kf1) obj).J.r.l();
                break;
            case 19:
                ((sf1) obj).b.C0();
                break;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 21:
                ((oi1) obj).a.H();
                break;
            case 22:
                ((pi1) obj).a.H();
                break;
            case 23:
                zi1 zi1Var = ((ni1) obj).b;
                zi1Var.L0.unlock();
                org.telegram.ui.Components.voip.l2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                zi1Var.Y.setCornerRadius(-1.0f);
                zi1Var.c0.d.release();
                zi1Var.d0.d.release();
                zi1Var.b0.release();
                zi1Var.l();
                zi1Var.u0.d();
                org.telegram.ui.Components.voip.l2.T = false;
                zi1Var.E0 = false;
                zi1.n1 = null;
                break;
            case 24:
                xi1 xi1Var = (xi1) obj;
                xi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (xi1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 25:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
