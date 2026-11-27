// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.t;
import org.telegram.ui.u;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n88 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n88(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((PhotoViewer) ((v5) obj).c).B2 = null;
                break;
            case 13:
                ((ui8) obj).q1 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a aVar;
        switch (this.a) {
            case 0:
                o88 o88Var = (o88) ((li7) this.b).b;
                if (animator.equals(o88Var.d)) {
                    o88Var.d = null;
                    break;
                }
                break;
            case 1:
                hl.d3(((o88) this.b).e, 1000L);
                break;
            case 2:
                q98 q98Var = (q98) this.b;
                s98 s98Var = q98Var.n0;
                s98Var.r = null;
                boolean z = s98Var.x;
                r98[] r98VarArr = s98Var.n;
                if (z) {
                    r98VarArr[1].setVisibility(8);
                } else {
                    r98 r98Var = r98VarArr[0];
                    r98VarArr[0] = r98VarArr[1];
                    r98VarArr[1] = r98Var;
                    r98Var.setVisibility(8);
                    s98Var.e = s98Var.n[0].b == s98Var.h.getFirstTabId();
                    s98Var.h.i(1.0f, s98Var.n[0].b);
                }
                s98Var.s = false;
                q98Var.i0 = false;
                q98Var.h0 = false;
                aVar = ((e) s98Var).actionBar;
                aVar.setEnabled(true);
                s98Var.h.setEnabled(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((v5) this.b).c;
                if (photoViewer.B2 != null) {
                    x38 x38Var = new x38(this, (byte) 13);
                    photoViewer.I2 = x38Var;
                    hl.d3(x38Var, 860L);
                    break;
                }
                break;
            case 4:
                t tVar = (t) this.b;
                PhotoViewer photoViewer2 = tVar.b;
                b43 b43Var = photoViewer2.D1.b;
                b43Var.q();
                CropAreaView cropAreaView = b43Var.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = tVar.a;
                photoViewer2.c0().M.b(photoViewer2.t4 != 0);
                rx5 rx5Var = photoViewer2.L1;
                if (rx5Var != null) {
                    rx5Var.b(photoViewer2.t4 != 3);
                }
                if (photoViewer2.t4 != 3) {
                    photoViewer2.Y5 = 0.0f;
                }
                photoViewer2.n6 = -1;
                photoViewer2.d6 = 1.0f;
                photoViewer2.Z5 = 1.0f;
                photoViewer2.b6 = 0.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.I2(1.0f);
                photoViewer2.u2 = true;
                photoViewer2.f0.invalidate();
                break;
            case 5:
                u uVar = (u) this.b;
                PhotoViewer photoViewer3 = uVar.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = uVar.a;
                photoViewer3.c0().M.b(photoViewer3.t4 != 0);
                rx5 rx5Var2 = photoViewer3.L1;
                if (rx5Var2 != null) {
                    rx5Var2.b(photoViewer3.t4 != 3);
                }
                if (photoViewer3.t4 != 3) {
                    photoViewer3.Y5 = 0.0f;
                }
                photoViewer3.n6 = -1;
                photoViewer3.d6 = 1.0f;
                photoViewer3.Z5 = 1.0f;
                photoViewer3.b6 = 0.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.I2(1.0f);
                photoViewer3.u2 = true;
                photoViewer3.f0.invalidate();
                break;
            case 6:
                ((PhotoViewer) ((ic8) this.b).q0).y3[0].setTag(null);
                break;
            case 7:
                ((jc8) this.b).d.U1.k0 = 1.0f;
                break;
            case 8:
                PhotoViewer photoViewer4 = ((jc8) this.b).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.k0 = 1.0f;
                break;
            case 9:
                hl.c3(new x38(this, (byte) 15));
                break;
            case 10:
                PhotoViewer photoViewer5 = ((ec8) this.b).c;
                if (animator.equals(photoViewer5.Z7)) {
                    photoViewer5.Z7 = null;
                    break;
                }
                break;
            case 11:
                dd8 dd8Var = (dd8) this.b;
                if (dd8Var.e == animator) {
                    dd8Var.c[1].setVisibility(8);
                    dd8Var.e = null;
                    break;
                }
                break;
            case 12:
                de8 de8Var = (de8) this.b;
                if (de8Var.C != null) {
                    de8Var.C = null;
                    de8Var.b();
                    break;
                }
                break;
            case 13:
                break;
            case 14:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    break;
                }
                break;
            case 15:
                fj8 fj8Var = (fj8) this.b;
                fj8Var.f = false;
                fj8Var.G = null;
                break;
            case 16:
                ok8 ok8Var = (ok8) this.b;
                ok8Var.s = ok8Var.r ? 1.0f : 0.0f;
                ok8Var.e();
                break;
            case 17:
                super.onAnimationEnd(animator);
                ((hm8) this.b).x = null;
                break;
            case 18:
                super.onAnimationEnd(animator);
                zn8 zn8Var = (zn8) this.b;
                if (zn8Var.getParent() != null) {
                    ((ViewGroup) zn8Var.getParent()).removeView(zn8Var);
                    break;
                }
                break;
            case 19:
                gkc gkcVar = (gkc) this.b;
                if (!gkcVar.a) {
                    gkcVar.W.w.T = true;
                    gkcVar.W.w.invalidate();
                    break;
                }
                break;
            case 20:
                ((mq8) this.b).b.V5 = null;
                break;
            case 21:
                xr8 xr8Var = (xr8) this.b;
                if (!xr8Var.F) {
                    xr8Var.setVisibility(8);
                    break;
                }
                break;
            case 22:
                zu8 zu8Var = (zu8) this.b;
                if (animator.equals(zu8Var.d)) {
                    zu8Var.d = null;
                    break;
                }
                break;
            case 23:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                iq8 iq8Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                iq8Var.S = 1.0f;
                iq8Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 24:
                ((ey8) this.b).b();
                break;
            case 25:
                ((o39) this.b).h.setVisibility(8);
                break;
            case 26:
                ((Runnable) this.b).run();
                break;
            case 27:
                ((p49) this.b).y.c();
                break;
            case 28:
                d79 d79Var = (d79) this.b;
                View view = d79Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (d79Var.d1()) {
                    d79Var.invalidate();
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ((ek9) this.b).w = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                PhotoViewer photoViewer = ((t) obj).b;
                photoViewer.V0.setVisibility(0);
                photoViewer.D1.setVisibility(0);
                break;
            case 5:
                break;
            case 21:
                ((xr8) obj).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
