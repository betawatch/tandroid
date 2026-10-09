package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nz0(Object obj, int i10) {
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
                    pz0 pz0Var = profileActivity.n0;
                    while (pz0Var.D0.k(i11) != pz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    pz0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((g01) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.e1, 0, true, new ci.za(2, profileActivity2, true));
                break;
            case 2:
                k01 k01Var = (k01) obj;
                k01Var.M0(k01Var.getTabProgress());
                break;
            case 3:
                ((b11) obj).c();
                break;
            case 4:
                ((p11) obj).a();
                break;
            case 5:
                m11 m11Var = (m11) obj;
                m11Var.f.add(m11Var.c);
                m11Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((ai.y8) obj).e();
                break;
            case 8:
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) obj;
                if (LaunchActivity.U() != null) {
                    if (adVar == null) {
                        adVar = org.telegram.ui.Components.ad.a0(LaunchActivity.U());
                    }
                    if (adVar != null) {
                        org.telegram.ui.Components.tc M = adVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 9:
                ((l41) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 11:
                u41 u41Var = (u41) obj;
                u41Var.dismiss();
                of.f.s(u41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ul0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 13:
                k51 k51Var = ((j51) obj).a;
                k51Var.Q = true;
                k51Var.N.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((z61) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.c71 c71Var = ((u71) obj).i0;
                if (c71Var != null) {
                    c71Var.N(true);
                    break;
                }
                break;
            case 17:
                ((n71) obj).a();
                break;
            case 18:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                ((hf1) obj).J.r.l();
                break;
            case 20:
                ((pf1) obj).b.C0();
                break;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 22:
                ((li1) obj).a.G();
                break;
            case 23:
                ((mi1) obj).a.G();
                break;
            case 24:
                wi1 wi1Var = ((ki1) obj).b;
                wi1Var.L0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                wi1Var.Y.setCornerRadius(-1.0f);
                wi1Var.c0.d.release();
                wi1Var.d0.d.release();
                wi1Var.b0.release();
                wi1Var.k();
                wi1Var.u0.d();
                org.telegram.ui.Components.voip.m2.U = false;
                wi1Var.E0 = false;
                wi1.n1 = null;
                break;
            case 25:
                ui1 ui1Var = (ui1) obj;
                ui1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ui1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 26:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
