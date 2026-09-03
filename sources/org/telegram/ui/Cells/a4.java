package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.xq;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                if (!d4Var.c()) {
                    d4Var.b(this.b);
                }
                d4Var.a0 = null;
                break;
            case 1:
                ((org.telegram.ui.Components.j6) this.c).r(this.b);
                break;
            case 2:
                ((org.telegram.ui.Components.w7) this.c).a[this.b].setVisibility(8);
                break;
            case 3:
                ((np) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(mr.g).setStartDelay(0L).setDuration(100L).start();
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
                qh0 qh0Var = (qh0) this.c;
                qh0Var.E = null;
                qh0Var.M.a1.delete(this.b);
                break;
            case 6:
                xq xqVar = (xq) this.c;
                ((yk0) xqVar.d).b.remove(this.b);
                yk0 yk0Var = (yk0) xqVar.d;
                yk0Var.d = true;
                yk0Var.a.invalidate();
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
                rh.p2 p2Var = (rh.p2) this.c;
                p2Var.M.setColor(this.b);
                p2Var.A();
                p2Var.e.invalidate();
                org.telegram.ui.h3 h3Var = p2Var.R0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(p2Var.M.getColor()) <= 0.721f, false);
                    p2Var.R0.setBackgroundColor(p2Var.M.getColor());
                }
                p2Var.F();
                break;
            case 10:
                rh.n3 n3Var = (rh.n3) this.c;
                rh.i3 i3Var = n3Var.n;
                if (i3Var.getWebView() != null) {
                    i3Var.getWebView().setScrollY(this.b);
                }
                if (animator == n3Var.r) {
                    n3Var.r = null;
                    break;
                }
                break;
            default:
                vh.p4 p4Var = (vh.p4) this.c;
                p4Var.T = this.b;
                p4Var.U = 0.0f;
                p4Var.requestLayout();
                p4Var.invalidate();
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
