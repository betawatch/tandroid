package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ky0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ag.y1) obj).c;
                if (profileActivity.j5 != 1.0f) {
                    my0 my0Var = profileActivity.j0;
                    while (my0Var.z0.k(i12) != my0Var.getRealCount() - 1) {
                        i12++;
                    }
                    my0Var.x(i12, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((dz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.a1, 0, true, new lh.ia(true, profileActivity2, i11));
                break;
            case 2:
                hz0 hz0Var = (hz0) obj;
                hz0Var.M0(hz0Var.getTabProgress());
                break;
            case 3:
                ((yz0) obj).c();
                break;
            case 4:
                ((n01) obj).a();
                break;
            case 5:
                k01 k01Var = (k01) obj;
                k01Var.f.add(k01Var.c);
                k01Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((jh.f6) obj).e();
                break;
            case 8:
                j11 j11Var = (j11) obj;
                AndroidUtilities.hideKeyboard(j11Var.d.findFocus());
                while (i12 < j11Var.y.length) {
                    int i13 = j11Var.w;
                    if ((i13 != 0 || i12 == 4) && (i13 != 1 || i12 == 2 || i12 == 3)) {
                        j11Var.a[i12].setText((CharSequence) null);
                    }
                    i12++;
                }
                break;
            case 9:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) obj;
                if (LaunchActivity.U() != null) {
                    if (mcVar == null) {
                        mcVar = org.telegram.ui.Components.mc.a0(LaunchActivity.U());
                    }
                    if (mcVar != null) {
                        org.telegram.ui.Components.ec M = mcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 10:
                ((g31) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 12:
                m31 m31Var = (m31) obj;
                m31Var.dismiss();
                we.e.s(m31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.fk0) obj).c;
                Runnable runnable = secretMediaViewer.k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.k0 = null;
                    break;
                }
                break;
            case 14:
                c41 c41Var = ((b41) obj).a;
                c41Var.M = true;
                c41Var.J.invalidate();
                break;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 16:
                AndroidUtilities.updateViewShow(((p51) obj).c, true);
                break;
            case 17:
                org.telegram.ui.Components.b51 b51Var = ((k61) obj).e0;
                if (b51Var != null) {
                    b51Var.N(true);
                    break;
                }
                break;
            case 18:
                ((d61) obj).a();
                break;
            case 19:
                qf.h.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                ((yd1) obj).J.r.l();
                break;
            case 21:
                ((ge1) obj).b.C0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((ah1) obj).a.H();
                break;
            case 24:
                ((bh1) obj).a.H();
                break;
            case 25:
                lh1 lh1Var = ((zg1) obj).b;
                lh1Var.H0.unlock();
                org.telegram.ui.Components.voip.l2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                lh1Var.U.setCornerRadius(-1.0f);
                lh1Var.Y.d.release();
                lh1Var.Z.d.release();
                lh1Var.X.release();
                lh1Var.l();
                lh1Var.q0.d();
                org.telegram.ui.Components.voip.l2.P = false;
                lh1Var.A0 = false;
                lh1.j1 = null;
                break;
            case 26:
                jh1 jh1Var = (jh1) obj;
                jh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (jh1Var.a.j0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.g0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
