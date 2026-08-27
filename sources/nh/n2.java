package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.pq;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.c;
                b3Var.L.setColor(this.b);
                b3Var.A();
                b3Var.e.invalidate();
                org.telegram.ui.h3 h3Var = b3Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(b3Var.L.getColor()) <= 0.721f, false);
                    b3Var.Q0.setBackgroundColor(b3Var.L.getColor());
                }
                b3Var.F();
                break;
            case 1:
                e4 e4Var = (e4) this.c;
                x3 x3Var = e4Var.n;
                if (x3Var.getWebView() != null) {
                    x3Var.getWebView().setScrollY(this.b);
                }
                if (animator == e4Var.r) {
                    e4Var.r = null;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) this.c;
                if (!b4Var.c()) {
                    b4Var.b(this.b);
                }
                b4Var.W = null;
                break;
            case 3:
                ((i6) this.c).r(this.b);
                break;
            case 4:
                ((v7) this.c).a[this.b].setVisibility(8);
                break;
            case 5:
                ((ep) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(er.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 6:
                ox oxVar = (ox) this.c;
                ag.s1 s1Var = oxVar.h;
                int i10 = this.b;
                s1Var.setVisibility(i10 == 1 ? 0 : 8);
                oxVar.e.setVisibility(i10 == 2 ? 0 : 8);
                oxVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 7:
                wg0 wg0Var = (wg0) this.c;
                wg0Var.D = null;
                wg0Var.L.Z0.delete(this.b);
                break;
            case 8:
                pq pqVar = (pq) this.c;
                ((gk0) pqVar.d).b.remove(this.b);
                gk0 gk0Var = (gk0) pqVar.d;
                gk0Var.d = true;
                gk0Var.a.invalidate();
                break;
            case 9:
                as0 as0Var = (as0) this.c;
                as0Var.e.K1.remove(this.b);
                as0Var.a.invalidate();
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
                rh.m4 m4Var = (rh.m4) this.c;
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
            case 6:
                ox oxVar = (ox) this.c;
                oxVar.h.setVisibility(0);
                oxVar.e.setVisibility(0);
                oxVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
