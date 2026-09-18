package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.th0;
import org.telegram.ui.zq;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                ((o6) this.c).r(this.b);
                break;
            case 5:
                ((d8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((qp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                cy cyVar = (cy) this.c;
                rg.p0 p0Var = cyVar.h;
                int i10 = this.b;
                p0Var.setVisibility(i10 == 1 ? 0 : 8);
                cyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                cyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                th0 th0Var = (th0) this.c;
                th0Var.H = null;
                th0Var.P.d1.delete(this.b);
                break;
            case 9:
                zq zqVar = (zq) this.c;
                ((bl0) zqVar.d).b.remove(this.b);
                bl0 bl0Var = (bl0) zqVar.d;
                bl0Var.d = true;
                bl0Var.a.invalidate();
                break;
            case 10:
                ft0 ft0Var = (ft0) this.c;
                ft0Var.e.O1.remove(this.b);
                ft0Var.a.invalidate();
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
