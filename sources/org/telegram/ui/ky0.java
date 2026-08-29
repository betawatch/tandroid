package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i11 = 1;
        int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((bg.d1) obj).c;
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
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.a1, 0, true, new nh.w9(true, profileActivity2, i11));
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
                ((lh.g6) obj).e();
                break;
            case 8:
                l11 l11Var = (l11) obj;
                AndroidUtilities.hideKeyboard(l11Var.d.findFocus());
                while (i12 < l11Var.y.length) {
                    int i13 = l11Var.w;
                    if ((i13 != 0 || i12 == 4) && (i13 != 1 || i12 == 2 || i12 == 3)) {
                        l11Var.a[i12].setText((CharSequence) null);
                    }
                    i12++;
                }
                break;
            case 9:
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) obj;
                if (LaunchActivity.U() != null) {
                    if (tcVar == null) {
                        tcVar = org.telegram.ui.Components.tc.a0(LaunchActivity.U());
                    }
                    if (tcVar != null) {
                        org.telegram.ui.Components.mc M = tcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 10:
                ((h31) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 12:
                o31 o31Var = (o31) obj;
                o31Var.dismiss();
                ye.d.s(o31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ok0) obj).c;
                Runnable runnable = secretMediaViewer.k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.k0 = null;
                    break;
                }
                break;
            case 14:
                f41 f41Var = ((e41) obj).a;
                f41Var.M = true;
                f41Var.J.invalidate();
                break;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 16:
                AndroidUtilities.updateViewShow(((s51) obj).c, true);
                break;
            case 17:
                org.telegram.ui.Components.k51 k51Var = ((n61) obj).e0;
                if (k51Var != null) {
                    k51Var.N(true);
                    break;
                }
                break;
            case 18:
                ((g61) obj).a();
                break;
            case 19:
                sf.g.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                ((zd1) obj).J.r.l();
                break;
            case 21:
                ((ie1) obj).b.C0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((dh1) obj).a.H();
                break;
            case 24:
                ((eh1) obj).a.H();
                break;
            case 25:
                oh1 oh1Var = ((ch1) obj).b;
                oh1Var.H0.unlock();
                org.telegram.ui.Components.voip.o2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                oh1Var.U.setCornerRadius(-1.0f);
                oh1Var.Y.d.release();
                oh1Var.Z.d.release();
                oh1Var.X.release();
                oh1Var.l();
                oh1Var.q0.d();
                org.telegram.ui.Components.voip.o2.P = false;
                oh1Var.A0 = false;
                oh1.j1 = null;
                break;
            case 26:
                mh1 mh1Var = (mh1) obj;
                mh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (mh1Var.a.j0 && VoIPService.getSharedInstance() != null) {
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
