package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pu0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                qu0 qu0Var = (qu0) obj;
                qu0Var.G.getNotificationCenter().j(qu0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.k0) obj).c;
                if (profileActivity.r5 != 1.0f) {
                    yu0 yu0Var = profileActivity.o0;
                    while (yu0Var.E0.k(i10) != yu0Var.getRealCount() - 1) {
                        i10++;
                    }
                    yu0Var.x(i10, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((pv0) obj).b;
                RectF rectF = ProfileActivity.X6;
                profileActivity2.getMessagesController().e5(profileActivity2.e1, 0, true, new hi.j9(2, profileActivity2, true));
                break;
            case 3:
                uv0 uv0Var = (uv0) obj;
                uv0Var.Z0(uv0Var.getTabProgress());
                break;
            case 4:
                ((lw0) obj).c();
                break;
            case 5:
                ((zw0) obj).a();
                break;
            case 6:
                ww0 ww0Var = (ww0) obj;
                ww0Var.f.add(ww0Var.c);
                ww0Var.a();
                break;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 8:
                ((fi.g6) obj).e();
                break;
            case 9:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) obj;
                if (LaunchActivity.T() != null) {
                    if (ccVar == null) {
                        ccVar = org.telegram.ui.Components.cc.a0(LaunchActivity.T());
                    }
                    if (ccVar != null) {
                        org.telegram.ui.Components.xb I = ccVar.I(R.raw.msg_antispam, org.telegram.messenger.hd.M0(2131746222, null), org.telegram.messenger.hd.M0(2131746185, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 10:
                ((uy0) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                break;
            case 12:
                org.telegram.ui.Components.p20 p20Var = (org.telegram.ui.Components.p20) obj;
                p20Var.dismiss();
                vf.c.t(p20Var.getContext(), org.telegram.messenger.hd.M0(2131746618, null));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.y50) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            case 14:
                pz0 pz0Var = ((oz0) obj).a;
                pz0Var.R = true;
                pz0Var.O.invalidate();
                break;
            case 15:
                ((org.telegram.messenger.ns) obj).o();
                break;
            case 16:
                org.telegram.messenger.g0.U3(((f01) obj).c, true, true);
                break;
            case 17:
                org.telegram.ui.Components.p41 p41Var = ((x11) obj).e2;
                if (p41Var != null) {
                    p41Var.O(true);
                    break;
                }
                break;
            case 18:
                ((q11) obj).a();
                break;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                z41 z41Var = (z41) obj;
                z41Var.n0.a(z41Var.k0.f0, z41Var.l0.isAttachedToWindow());
                break;
            case 21:
                ((x81) obj).J.r.f();
                break;
            case 22:
                ((f91) obj).b.G0();
                break;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 24:
                ((vb1) obj).a.y();
                break;
            case 25:
                ((wb1) obj).a.y();
                break;
            case 26:
                ec1 ec1Var = ((ub1) obj).b;
                ec1Var.L0.e();
                org.telegram.ui.Components.voip.i2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ec1Var.Z.setCornerRadius(-1.0f);
                ec1Var.d0.d.release();
                ec1Var.e0.d.release();
                ec1Var.c0.release();
                ec1Var.c();
                ec1Var.u0.d();
                org.telegram.ui.Components.voip.i2.T = false;
                ec1Var.E0 = false;
                ec1.m1 = null;
                org.telegram.ui.Components.voip.j2.g();
                break;
            case 27:
                cc1 cc1Var = (cc1) obj;
                cc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (cc1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 28:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                ((WallpapersListActivity) obj).G0(false);
                break;
        }
    }
}
