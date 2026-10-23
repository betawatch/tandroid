package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ki.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.c;
                d3Var.Q.setColor(this.b);
                d3Var.B();
                d3Var.f.invalidate();
                org.telegram.ui.e3 e3Var = d3Var.Y0;
                if (e3Var != null) {
                    e3Var.b(AndroidUtilities.computePerceivedBrightness(d3Var.Q.getColor()) <= 0.721f, false);
                    d3Var.Y0.setBackgroundColor(d3Var.Q.getColor());
                }
                d3Var.G();
                break;
            case 1:
                f4 f4Var = (f4) this.c;
                v2 v2Var = f4Var.n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(this.b);
                }
                if (animator == f4Var.r) {
                    f4Var.r = null;
                    break;
                }
                break;
            case 2:
                u4 u4Var = (u4) this.c;
                u4Var.W = this.b;
                u4Var.a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.c;
                if (!d4Var.c()) {
                    d4Var.b(this.b);
                }
                d4Var.d0 = null;
                break;
            case 4:
                ((p6) this.c).u(this.b);
                break;
            case 5:
                ((e8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((bq) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                jy jyVar = (jy) this.c;
                sg.p0 p0Var = jyVar.r;
                int i10 = this.b;
                p0Var.setVisibility(i10 == 1 ? 0 : 8);
                jyVar.h.setVisibility(i10 == 2 ? 0 : 8);
                jyVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                m60 m60Var = (m60) this.c;
                if (this.b == m60Var.s0) {
                    m60Var.x.setRotationY(0.0f);
                    m60Var.q0 = true;
                    m60Var.b0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = m60Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    FileLog.d(sb2.toString());
                    m60.l(m60Var);
                    break;
                }
                break;
            case 9:
                ii0 ii0Var = (ii0) this.c;
                ii0Var.H = null;
                ii0Var.P.d1.delete(this.b);
                break;
            case 10:
                qq qqVar = (qq) this.c;
                ((rl0) qqVar.d).b.remove(this.b);
                rl0 rl0Var = (rl0) qqVar.d;
                rl0Var.d = true;
                rl0Var.a.invalidate();
                break;
            case 11:
                st0 st0Var = (st0) this.c;
                st0Var.e.P1.remove(this.b);
                st0Var.a.invalidate();
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
                jy jyVar = (jy) this.c;
                jyVar.r.setVisibility(0);
                jyVar.h.setVisibility(0);
                jyVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
