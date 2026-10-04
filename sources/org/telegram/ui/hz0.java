package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                ((f41) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Y();
                break;
            case 11:
                o41 o41Var = (o41) obj;
                o41Var.dismiss();
                nf.f.s(o41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
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
                e51 e51Var = ((d51) obj).a;
                e51Var.Q = true;
                e51Var.N.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((r61) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.u61 u61Var = ((m71) obj).i0;
                if (u61Var != null) {
                    u61Var.N(true);
                    break;
                }
                break;
            case 17:
                ((f71) obj).a();
                break;
            case 18:
                hg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                va1 va1Var = (va1) obj;
                va1Var.m0.a(va1Var.j0.h1, va1Var.k0.isAttachedToWindow());
                break;
            case 20:
                ((af1) obj).J.r.l();
                break;
            case 21:
                ((if1) obj).b.C0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((bi1) obj).a.H();
                break;
            case 24:
                ((ci1) obj).a.H();
                break;
            case 25:
                mi1 mi1Var = ((ai1) obj).b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.c0.d.release();
                mi1Var.d0.d.release();
                mi1Var.b0.release();
                mi1Var.l();
                mi1Var.u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.n1 = null;
                break;
            case 26:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
