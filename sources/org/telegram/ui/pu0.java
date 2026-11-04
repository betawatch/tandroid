package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pu0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.c0) obj).c;
                if (profileActivity.o5 != 1.0f) {
                    ru0 ru0Var = profileActivity.o0;
                    while (ru0Var.E0.k(i10) != ru0Var.getRealCount() - 1) {
                        i10++;
                    }
                    ru0Var.x(i10, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((iv0) obj).b;
                RectF rectF = ProfileActivity.T6;
                profileActivity2.getMessagesController().d5(profileActivity2.e1, 0, true, new gi.m9(2, profileActivity2, true));
                break;
            case 2:
                mv0 mv0Var = (mv0) obj;
                mv0Var.X0(mv0Var.getTabProgress());
                break;
            case 3:
                ((ew0) obj).c();
                break;
            case 4:
                ((sw0) obj).a();
                break;
            case 5:
                pw0 pw0Var = (pw0) obj;
                pw0Var.f.add(pw0Var.c);
                pw0Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((ei.n6) obj).e();
                break;
            case 8:
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) obj;
                if (LaunchActivity.T() != null) {
                    if (fcVar == null) {
                        fcVar = org.telegram.ui.Components.fc.a0(LaunchActivity.T());
                    }
                    if (fcVar != null) {
                        org.telegram.ui.Components.ac I = fcVar.I(R.raw.msg_antispam, org.telegram.messenger.bd.M0(2131746232, null), org.telegram.messenger.bd.M0(2131746195, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 9:
                ((my0) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                break;
            case 11:
                org.telegram.ui.Components.i20 i20Var = (org.telegram.ui.Components.i20) obj;
                i20Var.dismiss();
                sf.c.t(i20Var.getContext(), org.telegram.messenger.bd.M0(2131746626, null));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ri0) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            case 13:
                iz0 iz0Var = ((hz0) obj).a;
                iz0Var.R = true;
                iz0Var.O.invalidate();
                break;
            case 14:
                ((org.telegram.messenger.hs) obj).o();
                break;
            case 15:
                org.telegram.messenger.g0.V3(((yz0) obj).c, true, true);
                break;
            case 16:
                org.telegram.ui.Components.f41 f41Var = ((q11) obj).b2;
                if (f41Var != null) {
                    f41Var.O(true);
                    break;
                }
                break;
            case 17:
                ((j11) obj).a();
                break;
            case 18:
                lg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                r41 r41Var = (r41) obj;
                r41Var.n0.a(r41Var.k0.f0, r41Var.l0.isAttachedToWindow());
                break;
            case 20:
                ((q81) obj).J.r.f();
                break;
            case 21:
                ((y81) obj).b.G0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((pb1) obj).a.G();
                break;
            case 24:
                ((qb1) obj).a.G();
                break;
            case 25:
                zb1 zb1Var = ((ob1) obj).b;
                zb1Var.M0.e();
                org.telegram.ui.Components.voip.u1.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                zb1Var.Z.setCornerRadius(-1.0f);
                zb1Var.d0.d.release();
                zb1Var.e0.d.release();
                zb1Var.c0.release();
                zb1Var.d();
                zb1Var.v0.d();
                org.telegram.ui.Components.voip.u1.V = false;
                zb1Var.F0 = false;
                zb1.o1 = null;
                break;
            case 26:
                xb1 xb1Var = (xb1) obj;
                xb1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (xb1Var.a.o0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                ((WallpapersListActivity) obj).G0(false);
                break;
        }
    }
}
