package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.e1, 0, true, new ci.cb(true, profileActivity, 2));
                break;
            case 1:
                m01 m01Var = (m01) obj;
                m01Var.M0(m01Var.getTabProgress());
                break;
            case 2:
                ((d11) obj).c();
                break;
            case 3:
                ((r11) obj).a();
                break;
            case 4:
                o11 o11Var = (o11) obj;
                o11Var.f.add(o11Var.c);
                o11Var.a();
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
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) obj;
                if (LaunchActivity.U() != null) {
                    if (vcVar == null) {
                        vcVar = org.telegram.ui.Components.vc.a0(LaunchActivity.U());
                    }
                    if (vcVar != null) {
                        org.telegram.ui.Components.oc M = vcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
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
                s41 s41Var = (s41) obj;
                s41Var.dismiss();
                nf.f.s(s41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
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
                i51 i51Var = ((h51) obj).a;
                i51Var.Q = true;
                i51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((w61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.w51 w51Var = ((r71) obj).i0;
                if (w51Var != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 16:
                ((k71) obj).a();
                break;
            case 17:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
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
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ui1Var.Y.setCornerRadius(-1.0f);
                ui1Var.c0.d.release();
                ui1Var.d0.d.release();
                ui1Var.b0.release();
                ui1Var.l();
                ui1Var.u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
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
