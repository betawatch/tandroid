package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.vq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.c;
                if (!e4Var.c()) {
                    e4Var.b(this.b);
                }
                e4Var.a0 = null;
                break;
            case 1:
                ((org.telegram.ui.Components.j6) this.c).r(this.b);
                break;
            case 2:
                ((org.telegram.ui.Components.w7) this.c).a[this.b].setVisibility(8);
                break;
            case 3:
                ((op) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 4:
                zx zxVar = (zx) this.c;
                eg.c1 c1Var = zxVar.h;
                int i10 = this.b;
                c1Var.setVisibility(i10 == 1 ? 0 : 8);
                zxVar.e.setVisibility(i10 == 2 ? 0 : 8);
                zxVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 5:
                ph0 ph0Var = (ph0) this.c;
                ph0Var.E = null;
                ph0Var.M.a1.delete(this.b);
                break;
            case 6:
                vq vqVar = (vq) this.c;
                ((zk0) vqVar.d).b.remove(this.b);
                zk0 zk0Var = (zk0) vqVar.d;
                zk0Var.d = true;
                zk0Var.a.invalidate();
                break;
            case 7:
                ss0 ss0Var = (ss0) this.c;
                ss0Var.e.L1.remove(this.b);
                ss0Var.a.invalidate();
                break;
            case 8:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.c;
                a1Var.x = -1;
                a1Var.v = this.b;
                a1Var.s = 0.0f;
                a1Var.R = null;
                a1Var.e();
                break;
            case 9:
                rh.q2 q2Var = (rh.q2) this.c;
                q2Var.M.setColor(this.b);
                q2Var.A();
                q2Var.e.invalidate();
                org.telegram.ui.f3 f3Var = q2Var.R0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(q2Var.M.getColor()) <= 0.721f, false);
                    q2Var.R0.setBackgroundColor(q2Var.M.getColor());
                }
                q2Var.F();
                break;
            case 10:
                rh.o3 o3Var = (rh.o3) this.c;
                rh.j3 j3Var = o3Var.n;
                if (j3Var.getWebView() != null) {
                    j3Var.getWebView().setScrollY(this.b);
                }
                if (animator == o3Var.r) {
                    o3Var.r = null;
                    break;
                }
                break;
            default:
                vh.o4 o4Var = (vh.o4) this.c;
                o4Var.T = this.b;
                o4Var.U = 0.0f;
                o4Var.requestLayout();
                o4Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                zx zxVar = (zx) this.c;
                zxVar.h.setVisibility(0);
                zxVar.e.setVisibility(0);
                zxVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
