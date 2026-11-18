package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import oi.r4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.messenger.qu;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.y40;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) this.c).G;
                int i7 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.c;
                AnimatorSet animatorSet2 = x2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
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
                t2 t2Var = (t2) obj;
                t2Var.R.setColor(i10);
                t2Var.F();
                t2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = t2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(t2Var.R.getColor()) <= 0.721f, false);
                    t2Var.Z0.setBackgroundColor(t2Var.R.getColor());
                }
                t2Var.K();
                break;
            case 1:
                t3 t3Var = (t3) obj;
                l2 l2Var = t3Var.n;
                if (l2Var.getWebView() != null) {
                    l2Var.getWebView().setScrollY(i10);
                }
                if (animator == t3Var.r) {
                    t3Var.r = null;
                    break;
                }
                break;
            case 2:
                r4 r4Var = (r4) obj;
                r4Var.a0 = i10;
                r4Var.b0 = 0.0f;
                r4Var.requestLayout();
                r4Var.invalidate();
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
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) obj).G;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                AnimatorSet animatorSet2 = x2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = x2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(x2Var, i10);
                    }
                    org.telegram.messenger.g0.g3(new oi.a2(this, r1));
                }
                ks.e().k(99, 512);
                break;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i10);
                }
                f4Var.e0 = null;
                break;
            case 7:
                ((m6) obj).u(i10);
                break;
            case 8:
                ((b8) obj).a[i10].setVisibility(8);
                break;
            case 9:
                jx jxVar = (jx) obj;
                jxVar.r.setVisibility(i10 == 1 ? 0 : 8);
                jxVar.h.setVisibility(i10 == 2 ? 0 : 8);
                jxVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 10:
                y40 y40Var = (y40) obj;
                if (i10 == y40Var.u0) {
                    y40Var.x.setRotationY(0.0f);
                    y40Var.s0 = true;
                    y40Var.d0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = y40Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    a8.b(sb2.toString());
                    y40.n(y40Var);
                    break;
                }
                break;
            case 11:
                ag0 ag0Var = (ag0) obj;
                ag0Var.I = null;
                ag0Var.Q.e1.delete(i10);
                break;
            case 12:
                yp ypVar = (yp) obj;
                ((fj0) ypVar.d).b.remove(i10);
                fj0 fj0Var = (fj0) ypVar.d;
                fj0Var.d = true;
                fj0Var.a.invalidate();
                break;
            case 13:
                ir0 ir0Var = (ir0) obj;
                ir0Var.e.S1.remove(i10);
                ir0Var.a.invalidate();
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
                jx jxVar = (jx) this.c;
                jxVar.r.setVisibility(0);
                jxVar.h.setVisibility(0);
                jxVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
