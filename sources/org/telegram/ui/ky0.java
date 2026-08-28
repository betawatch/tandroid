package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ky0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        int i10 = 2;
        int i11 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((fh.v) obj).b;
                if (profileActivity.j5 != 1.0f) {
                    my0 my0Var = profileActivity.j0;
                    while (my0Var.z0.k(i11) != my0Var.getRealCount() - 1) {
                        i11++;
                    }
                    my0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((dz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.a1, 0, true, new kh.la(true, profileActivity2, i10));
                break;
            case 2:
                hz0 hz0Var = (hz0) obj;
                hz0Var.M0(hz0Var.getTabProgress());
                break;
            case 3:
                ((yz0) obj).c();
                break;
            case 4:
                ((m01) obj).a();
                break;
            case 5:
                j01 j01Var = (j01) obj;
                j01Var.f.add(j01Var.c);
                j01Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((ih.j6) obj).e();
                break;
            case 8:
                k11 k11Var = (k11) obj;
                AndroidUtilities.hideKeyboard(k11Var.d.findFocus());
                while (i11 < k11Var.y.length) {
                    int i12 = k11Var.w;
                    if ((i12 != 0 || i11 == 4) && (i12 != 1 || i11 == 2 || i11 == 3)) {
                        k11Var.a[i11].setText((CharSequence) null);
                    }
                    i11++;
                }
                break;
            case 9:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) obj;
                if (LaunchActivity.U() != null) {
                    if (ocVar == null) {
                        ocVar = org.telegram.ui.Components.oc.a0(LaunchActivity.U());
                    }
                    if (ocVar != null) {
                        org.telegram.ui.Components.gc M = ocVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
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
                saveToGallerySettingsActivity.Y();
                break;
            case 12:
                n31 n31Var = (n31) obj;
                n31Var.dismiss();
                ve.e.s(n31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.su0) obj).c;
                Runnable runnable = secretMediaViewer.k0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.k0 = null;
                    break;
                }
                break;
            case 14:
                d41 d41Var = ((c41) obj).a;
                d41Var.M = true;
                d41Var.J.invalidate();
                break;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 16:
                AndroidUtilities.updateViewShow(((q51) obj).c, true);
                break;
            case 17:
                org.telegram.ui.Components.z41 z41Var = ((l61) obj).e0;
                if (z41Var != null) {
                    z41Var.N(true);
                    break;
                }
                break;
            case 18:
                ((e61) obj).a();
                break;
            case 19:
                pf.g.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                ((xd1) obj).J.r.l();
                break;
            case 21:
                ((fe1) obj).b.B0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((bh1) obj).a.H();
                break;
            case 24:
                ((ch1) obj).a.H();
                break;
            case 25:
                mh1 mh1Var = ((ah1) obj).b;
                mh1Var.H0.unlock();
                org.telegram.ui.Components.voip.l2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mh1Var.U.setCornerRadius(-1.0f);
                mh1Var.Y.d.release();
                mh1Var.Z.d.release();
                mh1Var.X.release();
                mh1Var.l();
                mh1Var.q0.d();
                org.telegram.ui.Components.voip.l2.P = false;
                mh1Var.A0 = false;
                mh1.j1 = null;
                break;
            case 26:
                kh1 kh1Var = (kh1) obj;
                kh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (kh1Var.a.j0 && VoIPService.getSharedInstance() != null) {
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
                ((WallpapersListActivity) obj).A0(false);
                break;
        }
    }
}
