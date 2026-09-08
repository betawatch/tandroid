package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.cr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                ji.w4 w4Var = (ji.w4) this.c;
                w4Var.W = this.b;
                w4Var.a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.c;
                if (!d4Var.c()) {
                    d4Var.b(this.b);
                }
                d4Var.d0 = null;
                break;
            case 4:
                ((p6) this.c).r(this.b);
                break;
            case 5:
                ((e8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((pp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                cy cyVar = (cy) this.c;
                sg.r0 r0Var = cyVar.h;
                int i10 = this.b;
                r0Var.setVisibility(i10 == 1 ? 0 : 8);
                cyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                cyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                ih0 ih0Var = (ih0) this.c;
                ih0Var.H = null;
                ih0Var.P.d1.delete(this.b);
                break;
            case 9:
                cr crVar = (cr) this.c;
                ((qk0) crVar.d).b.remove(this.b);
                qk0 qk0Var = (qk0) crVar.d;
                qk0Var.d = true;
                qk0Var.a.invalidate();
                break;
            case 10:
                ss0 ss0Var = (ss0) this.c;
                ss0Var.e.O1.remove(this.b);
                ss0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.c;
                b1Var.x = -1;
                b1Var.v = this.b;
                b1Var.s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                cy cyVar = (cy) this.c;
                cyVar.h.setVisibility(0);
                cyVar.e.setVisibility(0);
                cyVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
