package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                        org.telegram.ui.Components.pc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 8:
                ((m41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                v41 v41Var = (v41) obj;
                v41Var.dismiss();
                nf.f.s(v41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.zk0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 12:
                l51 l51Var = ((k51) obj).a;
                l51Var.Q = true;
                l51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((y61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.k61 k61Var = ((t71) obj).i0;
                if (k61Var != null) {
                    k61Var.N(true);
                    break;
                }
                break;
            case 16:
                ((m71) obj).a();
                break;
            case 17:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 18:
                ((hf1) obj).J.r.l();
                break;
            case 19:
                ((pf1) obj).b.C0();
                break;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 21:
                ((ii1) obj).a.H();
                break;
            case 22:
                ((ji1) obj).a.H();
                break;
            case 23:
                ti1 ti1Var = ((hi1) obj).b;
                ti1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ti1Var.Y.setCornerRadius(-1.0f);
                ti1Var.c0.d.release();
                ti1Var.d0.d.release();
                ti1Var.b0.release();
                ti1Var.l();
                ti1Var.u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
                ti1Var.E0 = false;
                ti1.n1 = null;
                break;
            case 24:
                ri1 ri1Var = (ri1) obj;
                ri1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ri1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
