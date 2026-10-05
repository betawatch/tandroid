package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hz0(Object obj, int i10) {
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
                ProfileActivity profileActivity = (ProfileActivity) ((ci.m6) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    jz0 jz0Var = profileActivity.n0;
                    while (jz0Var.D0.k(i11) != jz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    jz0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((a01) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.e1, 0, true, new ci.ya(true, profileActivity2, 2));
                break;
            case 2:
                e01 e01Var = (e01) obj;
                e01Var.M0(e01Var.getTabProgress());
                break;
            case 3:
                ((v01) obj).c();
                break;
            case 4:
                ((j11) obj).a();
                break;
            case 5:
                g11 g11Var = (g11) obj;
                g11Var.f.add(g11Var.c);
                g11Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((ai.x8) obj).e();
                break;
            case 8:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                if (LaunchActivity.U() != null) {
                    if (ycVar == null) {
                        ycVar = org.telegram.ui.Components.yc.a0(LaunchActivity.U());
                    }
                    if (ycVar != null) {
                        org.telegram.ui.Components.rc M = ycVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 9:
                ((d41) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Y();
                break;
            case 11:
                m41 m41Var = (m41) obj;
                m41Var.dismiss();
                nf.f.s(m41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.cl0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 13:
                c51 c51Var = ((b51) obj).a;
                c51Var.Q = true;
                c51Var.N.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((p61) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.w61 w61Var = ((k71) obj).i0;
                if (w61Var != null) {
                    w61Var.N(true);
                    break;
                }
                break;
            case 17:
                ((d71) obj).a();
                break;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                ta1 ta1Var = (ta1) obj;
                ta1Var.m0.a(ta1Var.j0.e0, ta1Var.k0.isAttachedToWindow());
                break;
            case 20:
                ((ye1) obj).J.r.l();
                break;
            case 21:
                ((gf1) obj).b.C0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((zh1) obj).a.H();
                break;
            case 24:
                ((ai1) obj).a.H();
                break;
            case 25:
                ki1 ki1Var = ((yh1) obj).b;
                ki1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ki1Var.Y.setCornerRadius(-1.0f);
                ki1Var.c0.d.release();
                ki1Var.d0.d.release();
                ki1Var.b0.release();
                ki1Var.l();
                ki1Var.u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                ki1Var.E0 = false;
                ki1.n1 = null;
                break;
            case 26:
                ii1 ii1Var = (ii1) obj;
                ii1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ii1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.i0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
