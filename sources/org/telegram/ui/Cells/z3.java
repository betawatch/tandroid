package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.vx;
import org.telegram.ui.pq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z3(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c4 c4Var = (c4) this.c;
                if (!c4Var.c()) {
                    c4Var.b(this.b);
                }
                c4Var.W = null;
                break;
            case 1:
                ((org.telegram.ui.Components.n6) this.c).r(this.b);
                break;
            case 2:
                ((org.telegram.ui.Components.a8) this.c).a[this.b].setVisibility(8);
                break;
            case 3:
                ((kp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(jr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 4:
                vx vxVar = (vx) this.c;
                cg.d1 d1Var = vxVar.h;
                int i10 = this.b;
                d1Var.setVisibility(i10 == 1 ? 0 : 8);
                vxVar.e.setVisibility(i10 == 2 ? 0 : 8);
                vxVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 5:
                eh0 eh0Var = (eh0) this.c;
                eh0Var.D = null;
                eh0Var.L.Z0.delete(this.b);
                break;
            case 6:
                pq pqVar = (pq) this.c;
                ((pk0) pqVar.d).b.remove(this.b);
                pk0 pk0Var = (pk0) pqVar.d;
                pk0Var.d = true;
                pk0Var.a.invalidate();
                break;
            case 7:
                ks0 ks0Var = (ks0) this.c;
                ks0Var.e.K1.remove(this.b);
                ks0Var.a.invalidate();
                break;
            case 8:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.c;
                b1Var.x = -1;
                b1Var.v = this.b;
                b1Var.s = 0.0f;
                b1Var.Q = null;
                b1Var.e();
                break;
            case 9:
                ph.p2 p2Var = (ph.p2) this.c;
                p2Var.L.setColor(this.b);
                p2Var.A();
                p2Var.e.invalidate();
                org.telegram.ui.h3 h3Var = p2Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(p2Var.L.getColor()) <= 0.721f, false);
                    p2Var.Q0.setBackgroundColor(p2Var.L.getColor());
                }
                p2Var.F();
                break;
            case 10:
                ph.n3 n3Var = (ph.n3) this.c;
                ph.i3 i3Var = n3Var.n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(this.b);
                }
                if (animator == n3Var.r) {
                    n3Var.r = null;
                    break;
                }
                break;
            default:
                th.m4 m4Var = (th.m4) this.c;
                m4Var.S = this.b;
                m4Var.T = 0.0f;
                m4Var.requestLayout();
                m4Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                vx vxVar = (vx) this.c;
                vxVar.h.setVisibility(0);
                vxVar.e.setVisibility(0);
                vxVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
