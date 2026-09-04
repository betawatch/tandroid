package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((i01) obj).b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.e1, 0, true, new di.cb(true, profileActivity, 2));
                break;
            case 1:
                m01 m01Var = (m01) obj;
                m01Var.M0(m01Var.getTabProgress());
                break;
            case 2:
                ((d11) obj).c();
                break;
            case 3:
                ((s11) obj).a();
                break;
            case 4:
                p11 p11Var = (p11) obj;
                p11Var.f.add(p11Var.c);
                p11Var.a();
                break;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 6:
                ((bi.f8) obj).e();
                break;
            case 7:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                if (LaunchActivity.U() != null) {
                    if (ycVar == null) {
                        ycVar = org.telegram.ui.Components.yc.a0(LaunchActivity.U());
                    }
                    if (ycVar != null) {
                        org.telegram.ui.Components.qc M = ycVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 8:
                ((o41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                u41 u41Var = (u41) obj;
                u41Var.dismiss();
                of.f.s(u41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.pk0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 12:
                k51 k51Var = ((j51) obj).a;
                k51Var.Q = true;
                k51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((y61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.v51 v51Var = ((t71) obj).i0;
                if (v51Var != null) {
                    v51Var.N(true);
                    break;
                }
                break;
            case 16:
                ((m71) obj).a();
                break;
            case 17:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 18:
                ((gf1) obj).J.r.l();
                break;
            case 19:
                ((of1) obj).b.C0();
                break;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 21:
                ((ji1) obj).a.H();
                break;
            case 22:
                ((ki1) obj).a.H();
                break;
            case 23:
                ui1 ui1Var = ((ii1) obj).b;
                ui1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.c0.d.release();
                ui1Var.d0.d.release();
                ui1Var.b0.release();
                ui1Var.l();
                ui1Var.u0.d();
                org.telegram.ui.Components.voip.k2.T = false;
                ui1Var.E0 = false;
                ui1.n1 = null;
                break;
            case 24:
                si1 si1Var = (si1) obj;
                si1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (si1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
