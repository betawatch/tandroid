package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.br;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                org.telegram.ui.c3 c3Var = k3Var.U0;
                if (c3Var != null) {
                    c3Var.b(AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f, false);
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
                ii.u4 u4Var = (ii.u4) this.c;
                u4Var.W = this.b;
                u4Var.a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.c;
                if (!e4Var.c()) {
                    e4Var.b(this.b);
                }
                e4Var.d0 = null;
                break;
            case 4:
                ((m6) this.c).r(this.b);
                break;
            case 5:
                ((b8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((qp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                ay ayVar = (ay) this.c;
                rg.p0 p0Var = ayVar.h;
                int i10 = this.b;
                p0Var.setVisibility(i10 == 1 ? 0 : 8);
                ayVar.e.setVisibility(i10 == 2 ? 0 : 8);
                ayVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                ih0 ih0Var = (ih0) this.c;
                ih0Var.H = null;
                ih0Var.P.d1.delete(this.b);
                break;
            case 9:
                br brVar = (br) this.c;
                ((qk0) brVar.d).b.remove(this.b);
                qk0 qk0Var = (qk0) brVar.d;
                qk0Var.d = true;
                qk0Var.a.invalidate();
                break;
            case 10:
                ts0 ts0Var = (ts0) this.c;
                ts0Var.e.O1.remove(this.b);
                ts0Var.a.invalidate();
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
                ay ayVar = (ay) this.c;
                ayVar.h.setVisibility(0);
                ayVar.e.setVisibility(0);
                ayVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
