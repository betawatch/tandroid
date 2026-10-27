package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oy0(Object obj, int i10) {
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
                int i12 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 1:
                sy0 sy0Var = (sy0) obj;
                sy0Var.G.getNotificationCenter().onAnimationFinish(sy0Var.F);
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) ((bh.p) obj).c;
                if (profileActivity.t5 != 1.0f) {
                    bz0 bz0Var = profileActivity.n0;
                    while (bz0Var.D0.k(i11) != bz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    bz0Var.x(i11, true);
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity2 = ((tz0) obj).b;
                int i13 = ProfileActivity.R6;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.e1, 0, true, new fi.ga(2, profileActivity2, true));
                break;
            case 4:
                xz0 xz0Var = (xz0) obj;
                xz0Var.T0(xz0Var.getTabProgress());
                break;
            case 5:
                ((o01) obj).c();
                break;
            case 6:
                ((d11) obj).a();
                break;
            case 7:
                a11 a11Var = (a11) obj;
                a11Var.f.add(a11Var.c);
                a11Var.a();
                break;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 9:
                ((di.v6) obj).e();
                break;
            case 10:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) obj;
                if (LaunchActivity.U() != null) {
                    if (wcVar == null) {
                        wcVar = org.telegram.ui.Components.wc.b0(LaunchActivity.U());
                    }
                    if (wcVar != null) {
                        org.telegram.ui.Components.qc M = wcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 11:
                ((g31) obj).invalidate();
                break;
            case 12:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.b0();
                break;
            case 13:
                o31 o31Var = (o31) obj;
                o31Var.dismiss();
                qf.d.r(o31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 14:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ml0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 15:
                f41 f41Var = ((e41) obj).a;
                f41Var.Q = true;
                f41Var.N.invalidate();
                break;
            case 16:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 17:
                AndroidUtilities.updateViewShow(((u51) obj).c, true);
                break;
            case 18:
                org.telegram.ui.Components.k71 k71Var = ((p61) obj).i0;
                if (k71Var != null) {
                    k71Var.O(true);
                    break;
                }
                break;
            case 19:
                ((i61) obj).a();
                break;
            case 20:
                jg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 21:
                y91 y91Var = (y91) obj;
                y91Var.m0.a(y91Var.j0.e0, y91Var.k0.isAttachedToWindow());
                break;
            case 22:
                ((ee1) obj).J.r.l();
                break;
            case 23:
                ((me1) obj).b.C0();
                break;
            case 24:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 25:
                ((gh1) obj).a.G();
                break;
            case 26:
                ((hh1) obj).a.G();
                break;
            case 27:
                rh1 rh1Var = ((fh1) obj).b;
                rh1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                rh1Var.Y.setCornerRadius(-1.0f);
                rh1Var.c0.d.release();
                rh1Var.d0.d.release();
                rh1Var.b0.release();
                rh1Var.k();
                rh1Var.u0.d();
                org.telegram.ui.Components.voip.n2.U = false;
                rh1Var.E0 = false;
                rh1.n1 = null;
                break;
            case 28:
                ph1 ph1Var = (ph1) obj;
                ph1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ph1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            default:
                ((VoIPPermissionActivity) obj).finish();
                break;
        }
    }
}
