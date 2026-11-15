package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import oi.p4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ns;
import org.telegram.messenger.uu;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.xp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2(Object obj, int i7, int i10) {
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
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.c;
                AnimatorSet animatorSet2 = u2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
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
                x2 x2Var = (x2) obj;
                x2Var.R.setColor(i10);
                x2Var.F();
                x2Var.f.invalidate();
                org.telegram.ui.b3 b3Var = x2Var.Z0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(x2Var.R.getColor()) <= 0.721f, false);
                    x2Var.Z0.setBackgroundColor(x2Var.R.getColor());
                }
                x2Var.K();
                break;
            case 1:
                y3 y3Var = (y3) obj;
                p2 p2Var = y3Var.n;
                if (p2Var.getWebView() != null) {
                    p2Var.getWebView().setScrollY(i10);
                }
                if (animator == y3Var.r) {
                    y3Var.r = null;
                    break;
                }
                break;
            case 2:
                p4 p4Var = (p4) obj;
                p4Var.a0 = i10;
                p4Var.b0 = 0.0f;
                p4Var.requestLayout();
                p4Var.invalidate();
                break;
            case 3:
                uu uuVar = (uu) obj;
                uuVar.b0 = i10;
                uuVar.c0 = 0.0f;
                View view = uuVar.W;
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
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                AnimatorSet animatorSet2 = u2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = u2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(u2Var, i10);
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.r0(this, 4));
                }
                ns.e().k(99, 512);
                break;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i10);
                }
                f4Var.e0 = null;
                break;
            case 7:
                ((g6) obj).u(i10);
                break;
            case 8:
                ((t7) obj).a[i10].setVisibility(8);
                break;
            case 9:
                dx dxVar = (dx) obj;
                dxVar.r.setVisibility(i10 == 1 ? 0 : 8);
                dxVar.h.setVisibility(i10 == 2 ? 0 : 8);
                dxVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 10:
                q40 q40Var = (q40) obj;
                if (i10 == q40Var.u0) {
                    q40Var.x.setRotationY(0.0f);
                    q40Var.s0 = true;
                    q40Var.d0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = q40Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    a8.b(sb2.toString());
                    q40.n(q40Var);
                    break;
                }
                break;
            case 11:
                qf0 qf0Var = (qf0) obj;
                qf0Var.I = null;
                qf0Var.Q.e1.delete(i10);
                break;
            case 12:
                xp xpVar = (xp) obj;
                ((xi0) xpVar.d).b.remove(i10);
                xi0 xi0Var = (xi0) xpVar.d;
                xi0Var.d = true;
                xi0Var.a.invalidate();
                break;
            case 13:
                ar0 ar0Var = (ar0) obj;
                ar0Var.e.S1.remove(i10);
                ar0Var.a.invalidate();
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
                dx dxVar = (dx) this.c;
                dxVar.r.setVisibility(0);
                dxVar.h.setVisibility(0);
                dxVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
