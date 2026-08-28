package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.nq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.c;
                c3Var.L.setColor(this.b);
                c3Var.A();
                c3Var.e.invalidate();
                org.telegram.ui.g3 g3Var = c3Var.Q0;
                if (g3Var != null) {
                    g3Var.b(AndroidUtilities.computePerceivedBrightness(c3Var.L.getColor()) <= 0.721f, false);
                    c3Var.Q0.setBackgroundColor(c3Var.L.getColor());
                }
                c3Var.F();
                break;
            case 1:
                g4 g4Var = (g4) this.c;
                z3 z3Var = g4Var.n;
                if (z3Var.getWebView() != null) {
                    z3Var.getWebView().setScrollY(this.b);
                }
                if (animator == g4Var.r) {
                    g4Var.r = null;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.c;
                if (!e4Var.c()) {
                    e4Var.b(this.b);
                }
                e4Var.W = null;
                break;
            case 3:
                ((i6) this.c).r(this.b);
                break;
            case 4:
                ((w7) this.c).a[this.b].setVisibility(8);
                break;
            case 5:
                ((gp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 6:
                nx nxVar = (nx) this.c;
                zf.p0 p0Var = nxVar.h;
                int i9 = this.b;
                p0Var.setVisibility(i9 == 1 ? 0 : 8);
                nxVar.e.setVisibility(i9 == 2 ? 0 : 8);
                nxVar.f.setVisibility(i9 == 3 ? 0 : 8);
                break;
            case 7:
                ug0 ug0Var = (ug0) this.c;
                ug0Var.D = null;
                ug0Var.L.Z0.delete(this.b);
                break;
            case 8:
                nq nqVar = (nq) this.c;
                ((dk0) nqVar.d).b.remove(this.b);
                dk0 dk0Var = (dk0) nqVar.d;
                dk0Var.d = true;
                dk0Var.a.invalidate();
                break;
            case 9:
                zr0 zr0Var = (zr0) this.c;
                zr0Var.e.K1.remove(this.b);
                zr0Var.a.invalidate();
                break;
            case 10:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.c;
                a1Var.x = -1;
                a1Var.v = this.b;
                a1Var.s = 0.0f;
                a1Var.Q = null;
                a1Var.e();
                break;
            default:
                qh.l4 l4Var = (qh.l4) this.c;
                l4Var.S = this.b;
                l4Var.T = 0.0f;
                l4Var.requestLayout();
                l4Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                nx nxVar = (nx) this.c;
                nxVar.h.setVisibility(0);
                nxVar.e.setVisibility(0);
                nxVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
