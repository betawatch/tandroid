package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.wq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                ((qp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 4:
                cy cyVar = (cy) this.c;
                fg.b1 b1Var = cyVar.h;
                int i10 = this.b;
                b1Var.setVisibility(i10 == 1 ? 0 : 8);
                cyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                cyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 5:
                rh0 rh0Var = (rh0) this.c;
                rh0Var.E = null;
                rh0Var.M.a1.delete(this.b);
                break;
            case 6:
                wq wqVar = (wq) this.c;
                ((al0) wqVar.d).b.remove(this.b);
                al0 al0Var = (al0) wqVar.d;
                al0Var.d = true;
                al0Var.a.invalidate();
                break;
            case 7:
                ts0 ts0Var = (ts0) this.c;
                ts0Var.e.L1.remove(this.b);
                ts0Var.a.invalidate();
                break;
            case 8:
                org.telegram.ui.Components.voip.b1 b1Var2 = (org.telegram.ui.Components.voip.b1) this.c;
                b1Var2.x = -1;
                b1Var2.v = this.b;
                b1Var2.s = 0.0f;
                b1Var2.R = null;
                b1Var2.e();
                break;
            case 9:
                sh.p2 p2Var = (sh.p2) this.c;
                p2Var.M.setColor(this.b);
                p2Var.A();
                p2Var.e.invalidate();
                org.telegram.ui.f3 f3Var = p2Var.R0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(p2Var.M.getColor()) <= 0.721f, false);
                    p2Var.R0.setBackgroundColor(p2Var.M.getColor());
                }
                p2Var.F();
                break;
            case 10:
                sh.n3 n3Var = (sh.n3) this.c;
                sh.i3 i3Var = n3Var.n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(this.b);
                }
                if (animator == n3Var.r) {
                    n3Var.r = null;
                    break;
                }
                break;
            default:
                wh.o4 o4Var = (wh.o4) this.c;
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
