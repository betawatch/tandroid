package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.tq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.c;
                m3Var.Q.setColor(this.b);
                m3Var.B();
                m3Var.f.invalidate();
                org.telegram.ui.c3 c3Var = m3Var.Y0;
                if (c3Var != null) {
                    c3Var.b(AndroidUtilities.computePerceivedBrightness(m3Var.Q.getColor()) <= 0.721f, false);
                    m3Var.Y0.setBackgroundColor(m3Var.Q.getColor());
                }
                m3Var.G();
                break;
            case 1:
                o4 o4Var = (o4) this.c;
                e3 e3Var = o4Var.n;
                if (e3Var.getWebView() != null) {
                    e3Var.getWebView().setScrollY(this.b);
                }
                if (animator == o4Var.r) {
                    o4Var.r = null;
                    break;
                }
                break;
            case 2:
                li.u4 u4Var = (li.u4) this.c;
                u4Var.W = this.b;
                u4Var.a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) this.c;
                if (!i4Var.c()) {
                    i4Var.b(this.b);
                }
                i4Var.d0 = null;
                break;
            case 4:
                ((r6) this.c).u(this.b);
                break;
            case 5:
                ((g8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((dq) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(ds.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                iy iyVar = (iy) this.c;
                tg.p0 p0Var = iyVar.r;
                int i10 = this.b;
                p0Var.setVisibility(i10 == 1 ? 0 : 8);
                iyVar.h.setVisibility(i10 == 2 ? 0 : 8);
                iyVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                o60 o60Var = (o60) this.c;
                if (this.b == o60Var.s0) {
                    o60Var.w.setRotationY(0.0f);
                    o60Var.q0 = true;
                    o60Var.b0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = o60Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    FileLog.d(sb2.toString());
                    o60.m(o60Var);
                    break;
                }
                break;
            case 9:
                ii0 ii0Var = (ii0) this.c;
                ii0Var.H = null;
                ii0Var.P.d1.delete(this.b);
                break;
            case 10:
                tq tqVar = (tq) this.c;
                ((rl0) tqVar.d).b.remove(this.b);
                rl0 rl0Var = (rl0) tqVar.d;
                rl0Var.d = true;
                rl0Var.a.invalidate();
                break;
            case 11:
                au0 au0Var = (au0) this.c;
                au0Var.e.R1.remove(this.b);
                au0Var.a.invalidate();
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
                iy iyVar = (iy) this.c;
                iyVar.r.setVisibility(0);
                iyVar.h.setVisibility(0);
                iyVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
