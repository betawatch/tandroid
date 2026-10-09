package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.zq;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.c;
                k3Var.P.setColor(this.b);
                k3Var.B();
                k3Var.e.invalidate();
                org.telegram.ui.d3 d3Var = k3Var.U0;
                if (d3Var != null) {
                    d3Var.b(AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.G();
                break;
            case 1:
                p4 p4Var = (p4) this.c;
                b3 b3Var = p4Var.n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.b);
                }
                if (animator == p4Var.r) {
                    p4Var.r = null;
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
                ((q6) this.c).u(this.b);
                break;
            case 5:
                ((f8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((gq) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(hs.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                ry ryVar = (ry) this.c;
                rg.p0 p0Var = ryVar.h;
                int i10 = this.b;
                p0Var.setVisibility(i10 == 1 ? 0 : 8);
                ryVar.e.setVisibility(i10 == 2 ? 0 : 8);
                ryVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                s60 s60Var = (s60) this.c;
                FrameLayout frameLayout = s60Var.x;
                if (this.b == s60Var.r0) {
                    frameLayout.animate().setListener(null);
                    frameLayout.setRotationY(0.0f);
                    s60Var.m0 = false;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip completed: elapsedMs=");
                    cameraFlipElapsedMs = s60Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    FileLog.d(sb2.toString());
                    s60Var.x();
                    break;
                }
                break;
            case 9:
                ni0 ni0Var = (ni0) this.c;
                ni0Var.H = null;
                ni0Var.P.d1.delete(this.b);
                break;
            case 10:
                zq zqVar = (zq) this.c;
                ((vl0) zqVar.d).b.remove(this.b);
                vl0 vl0Var = (vl0) zqVar.d;
                vl0Var.d = true;
                vl0Var.a.invalidate();
                break;
            case 11:
                wt0 wt0Var = (wt0) this.c;
                wt0Var.e.O1.remove(this.b);
                wt0Var.a.invalidate();
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
                ry ryVar = (ry) this.c;
                ryVar.h.setVisibility(0);
                ryVar.e.setVisibility(0);
                ryVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
