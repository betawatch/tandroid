package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.iv;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.uq;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class d5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d5(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.x1) this.c).F;
                int i10 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.c;
                AnimatorSet animatorSet2 = z2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.z0 = null;
                    z2Var.A0 = 0;
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
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                f5 f5Var = (f5) obj;
                f5Var.W = i11;
                f5Var.a0 = 0.0f;
                f5Var.requestLayout();
                f5Var.invalidate();
                break;
            case 1:
                iv ivVar = (iv) obj;
                ivVar.a0 = i11;
                ivVar.b0 = 0.0f;
                View view = ivVar.V;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 2:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.x1) obj).F;
                AnimatorSet animatorSet = animatorSetArr[i11];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i11] = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                AnimatorSet animatorSet2 = z2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.z0 = null;
                    z2Var.A0 = 0;
                    DialogInterface.OnClickListener onClickListener = z2Var.K;
                    if (onClickListener != null) {
                        onClickListener.onClick(z2Var, i11);
                    }
                    org.telegram.messenger.i0.g3(new lg.s(this, 21));
                }
                at.e().k(99, 512);
                break;
            case 4:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                if (!h4Var.c()) {
                    h4Var.b(i11);
                }
                h4Var.d0 = null;
                break;
            case 5:
                ((org.telegram.ui.Components.e6) obj).u(i11);
                break;
            case 6:
                ((r7) obj).a[i11].setVisibility(8);
                break;
            case 7:
                ((hp) obj).a[i11].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 8:
                mx mxVar = (mx) obj;
                mxVar.r.setVisibility(i11 == 1 ? 0 : 8);
                mxVar.h.setVisibility(i11 == 2 ? 0 : 8);
                mxVar.n.setVisibility(i11 == 3 ? 0 : 8);
                break;
            case 9:
                d50 d50Var = (d50) obj;
                if (i11 == d50Var.s0) {
                    d50Var.x.setRotationY(0.0f);
                    d50Var.q0 = true;
                    d50Var.b0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = d50Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    f8.b(sb2.toString());
                    d50.m(d50Var);
                    break;
                }
                break;
            case 10:
                qg0 qg0Var = (qg0) obj;
                qg0Var.H = null;
                qg0Var.P.d1.delete(i11);
                break;
            case 11:
                uq uqVar = (uq) obj;
                ((xj0) uqVar.d).b.remove(i11);
                xj0 xj0Var = (xj0) uqVar.d;
                xj0Var.d = true;
                xj0Var.a.invalidate();
                break;
            case 12:
                as0 as0Var = (as0) obj;
                as0Var.e.R1.remove(i11);
                as0Var.a.invalidate();
                break;
            case 13:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) obj;
                m0Var.y = -1;
                m0Var.w = i11;
                m0Var.s = 0.0f;
                m0Var.U = null;
                m0Var.e();
                break;
            case 14:
                xh.m2 m2Var = (xh.m2) obj;
                m2Var.Q.setColor(i11);
                m2Var.F();
                m2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = m2Var.Y0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.i0.B(m2Var.Q.getColor()) <= 0.721f, false);
                    m2Var.Y0.setBackgroundColor(m2Var.Q.getColor());
                }
                m2Var.K();
                break;
            default:
                xh.j3 j3Var = (xh.j3) obj;
                xh.e2 e2Var = j3Var.n;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().setScrollY(i11);
                }
                if (animator == j3Var.r) {
                    j3Var.r = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                mx mxVar = (mx) this.c;
                mxVar.r.setVisibility(0);
                mxVar.h.setVisibility(0);
                mxVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
