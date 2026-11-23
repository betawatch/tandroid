package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import oi.s4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.messenger.qu;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z7;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                k2 k2Var = t3Var.n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(i10);
                }
                if (animator == t3Var.r) {
                    t3Var.r = null;
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
                ((m6) obj).u(i10);
                break;
            case 8:
                ((z7) obj).a[i10].setVisibility(8);
                break;
            case 9:
                ix ixVar = (ix) obj;
                ixVar.r.setVisibility(i10 == 1 ? 0 : 8);
                ixVar.h.setVisibility(i10 == 2 ? 0 : 8);
                ixVar.n.setVisibility(i10 == 3 ? 0 : 8);
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
                bg0 bg0Var = (bg0) obj;
                bg0Var.I = null;
                bg0Var.Q.e1.delete(i10);
                break;
            case 12:
                yp ypVar = (yp) obj;
                ((hj0) ypVar.d).b.remove(i10);
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.d = true;
                hj0Var.a.invalidate();
                break;
            case 13:
                jr0 jr0Var = (jr0) obj;
                jr0Var.e.S1.remove(i10);
                jr0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) obj;
                d1Var.y = -1;
                d1Var.w = i10;
                d1Var.s = 0.0f;
                d1Var.V = null;
                d1Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ix ixVar = (ix) this.c;
                ixVar.r.setVisibility(0);
                ixVar.h.setVisibility(0);
                ixVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
