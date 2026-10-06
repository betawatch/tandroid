package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.yq;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class w2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l3 l3Var = (l3) this.c;
                l3Var.P.setColor(this.b);
                l3Var.A();
                l3Var.e.invalidate();
                org.telegram.ui.d3 d3Var = l3Var.U0;
                if (d3Var != null) {
                    d3Var.b(AndroidUtilities.computePerceivedBrightness(l3Var.P.getColor()) <= 0.721f, false);
                    l3Var.U0.setBackgroundColor(l3Var.P.getColor());
                }
                l3Var.F();
                break;
            case 1:
                r4 r4Var = (r4) this.c;
                k4 k4Var = r4Var.n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(this.b);
                }
                if (animator == r4Var.r) {
                    r4Var.r = null;
                    break;
                }
                break;
            case 2:
                ii.w4 w4Var = (ii.w4) this.c;
                w4Var.W = this.b;
                w4Var.a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
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
                ((tp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(tr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                fy fyVar = (fy) this.c;
                rg.q0 q0Var = fyVar.h;
                int i10 = this.b;
                q0Var.setVisibility(i10 == 1 ? 0 : 8);
                fyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                fyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                vh0 vh0Var = (vh0) this.c;
                vh0Var.H = null;
                vh0Var.P.d1.delete(this.b);
                break;
            case 9:
                yq yqVar = (yq) this.c;
                ((dl0) yqVar.d).b.remove(this.b);
                dl0 dl0Var = (dl0) yqVar.d;
                dl0Var.d = true;
                dl0Var.a.invalidate();
                break;
            case 10:
                lt0 lt0Var = (lt0) this.c;
                lt0Var.e.O1.remove(this.b);
                lt0Var.a.invalidate();
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
                fy fyVar = (fy) this.c;
                fyVar.h.setVisibility(0);
                fyVar.e.setVisibility(0);
                fyVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
