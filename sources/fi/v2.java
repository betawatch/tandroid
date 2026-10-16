package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.fr;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                org.telegram.ui.f3 f3Var = k3Var.U0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.G();
                break;
            case 1:
                q4 q4Var = (q4) this.c;
                b3 b3Var = q4Var.n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.b);
                }
                if (animator == q4Var.r) {
                    q4Var.r = null;
                    break;
                }
                break;
            case 2:
                ji.y4 y4Var = (ji.y4) this.c;
                y4Var.W = this.b;
                y4Var.a0 = 0.0f;
                y4Var.requestLayout();
                y4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.c;
                if (!e4Var.c()) {
                    e4Var.b(this.b);
                }
                e4Var.d0 = null;
                break;
            case 4:
                ((r6) this.c).u(this.b);
                break;
            case 5:
                ((g8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((dq) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(es.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                ny nyVar = (ny) this.c;
                sg.q0 q0Var = nyVar.h;
                int i10 = this.b;
                q0Var.setVisibility(i10 == 1 ? 0 : 8);
                nyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                nyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                o60 o60Var = (o60) this.c;
                if (this.b == o60Var.s0) {
                    o60Var.x.setRotationY(0.0f);
                    o60Var.q0 = true;
                    o60Var.b0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = o60Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    FileLog.d(sb2.toString());
                    o60.l(o60Var);
                    break;
                }
                break;
            case 9:
                ji0 ji0Var = (ji0) this.c;
                ji0Var.H = null;
                ji0Var.P.d1.delete(this.b);
                break;
            case 10:
                fr frVar = (fr) this.c;
                ((rl0) frVar.d).b.remove(this.b);
                rl0 rl0Var = (rl0) frVar.d;
                rl0Var.d = true;
                rl0Var.a.invalidate();
                break;
            case 11:
                st0 st0Var = (st0) this.c;
                st0Var.e.O1.remove(this.b);
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
                ny nyVar = (ny) this.c;
                nyVar.h.setVisibility(0);
                nyVar.e.setVisibility(0);
                nyVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
