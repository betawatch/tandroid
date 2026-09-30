package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.wq;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class v2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.c;
                k3Var.P.setColor(this.b);
                k3Var.A();
                k3Var.e.invalidate();
                org.telegram.ui.d3 d3Var = k3Var.U0;
                if (d3Var != null) {
                    d3Var.b(AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.F();
                break;
            case 1:
                q4 q4Var = (q4) this.c;
                j4 j4Var = q4Var.n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.b);
                }
                if (animator == q4Var.r) {
                    q4Var.r = null;
                    break;
                }
                break;
            case 2:
                ii.v4 v4Var = (ii.v4) this.c;
                v4Var.W = this.b;
                v4Var.a0 = 0.0f;
                v4Var.requestLayout();
                v4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.c;
                if (!e4Var.c()) {
                    e4Var.b(this.b);
                }
                e4Var.d0 = null;
                break;
            case 4:
                ((o6) this.c).r(this.b);
                break;
            case 5:
                ((d8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((sp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(sr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                ey eyVar = (ey) this.c;
                rg.p0 p0Var = eyVar.h;
                int i10 = this.b;
                p0Var.setVisibility(i10 == 1 ? 0 : 8);
                eyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                eyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                vh0 vh0Var = (vh0) this.c;
                vh0Var.H = null;
                vh0Var.P.d1.delete(this.b);
                break;
            case 9:
                wq wqVar = (wq) this.c;
                ((dl0) wqVar.d).b.remove(this.b);
                dl0 dl0Var = (dl0) wqVar.d;
                dl0Var.d = true;
                dl0Var.a.invalidate();
                break;
            case 10:
                gt0 gt0Var = (gt0) this.c;
                gt0Var.e.O1.remove(this.b);
                gt0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.c;
                d1Var.x = -1;
                d1Var.v = this.b;
                d1Var.s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                ey eyVar = (ey) this.c;
                eyVar.h.setVisibility(0);
                eyVar.e.setVisibility(0);
                eyVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
