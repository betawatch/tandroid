package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import oi.s4;
import org.telegram.messenger.ks;
import org.telegram.messenger.qu;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.n6;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) this.c).G;
                int i7 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                AnimatorSet animatorSet2 = w2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long cameraFlipElapsedMs;
        int i7 = this.a;
        int i10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                s2 s2Var = (s2) obj;
                s2Var.R.setColor(i10);
                s2Var.F();
                s2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = s2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(s2Var.R.getColor()) <= 0.721f, false);
                    s2Var.Z0.setBackgroundColor(s2Var.R.getColor());
                }
                s2Var.K();
                break;
            case 1:
                s3 s3Var = (s3) obj;
                k2 k2Var = s3Var.n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(i10);
                }
                if (animator == s3Var.r) {
                    s3Var.r = null;
                    break;
                }
                break;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.a0 = i10;
                s4Var.b0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                break;
            case 3:
                qu quVar = (qu) obj;
                quVar.b0 = i10;
                quVar.c0 = 0.0f;
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) obj).G;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                AnimatorSet animatorSet2 = w2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = w2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(w2Var, i10);
                    }
                    org.telegram.messenger.g0.g3(new oi.c2(this, r1));
                }
                ks.e().k(99, 512);
                break;
            case 6:
                g4 g4Var = (g4) obj;
                if (!g4Var.c()) {
                    g4Var.b(i10);
                }
                g4Var.e0 = null;
                break;
            case 7:
                ((n6) obj).u(i10);
                break;
            case 8:
                ((a8) obj).a[i10].setVisibility(8);
                break;
            case 9:
                lx lxVar = (lx) obj;
                lxVar.r.setVisibility(i10 == 1 ? 0 : 8);
                lxVar.h.setVisibility(i10 == 2 ? 0 : 8);
                lxVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 10:
                b50 b50Var = (b50) obj;
                if (i10 == b50Var.u0) {
                    b50Var.x.setRotationY(0.0f);
                    b50Var.s0 = true;
                    b50Var.d0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = b50Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    org.telegram.messenger.a8.b(sb2.toString());
                    b50.n(b50Var);
                    break;
                }
                break;
            case 11:
                cg0 cg0Var = (cg0) obj;
                cg0Var.I = null;
                cg0Var.Q.e1.delete(i10);
                break;
            case 12:
                yp ypVar = (yp) obj;
                ((hj0) ypVar.d).b.remove(i10);
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.d = true;
                hj0Var.a.invalidate();
                break;
            case 13:
                kr0 kr0Var = (kr0) obj;
                kr0Var.e.S1.remove(i10);
                kr0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) obj;
                c1Var.y = -1;
                c1Var.w = i10;
                c1Var.s = 0.0f;
                c1Var.V = null;
                c1Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                lx lxVar = (lx) this.c;
                lxVar.r.setVisibility(0);
                lxVar.h.setVisibility(0);
                lxVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
