package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import mi.t4;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.u7;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.tp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.s1) this.c).G;
                int i3 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i3];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i3] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.c;
                AnimatorSet animatorSet2 = t2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
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
        int i3 = this.a;
        int i10 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                a3 a3Var = (a3) obj;
                a3Var.R.setColor(i10);
                a3Var.F();
                a3Var.f.invalidate();
                org.telegram.ui.c3 c3Var = a3Var.Z0;
                if (c3Var != null) {
                    c3Var.b(org.telegram.messenger.g0.B(a3Var.R.getColor()) <= 0.721f, false);
                    a3Var.Z0.setBackgroundColor(a3Var.R.getColor());
                }
                a3Var.K();
                break;
            case 1:
                d4 d4Var = (d4) obj;
                s2 s2Var = d4Var.n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(i10);
                }
                if (animator == d4Var.r) {
                    d4Var.r = null;
                    break;
                }
                break;
            case 2:
                t4 t4Var = (t4) obj;
                t4Var.a0 = i10;
                t4Var.b0 = 0.0f;
                t4Var.requestLayout();
                t4Var.invalidate();
                break;
            case 3:
                ou ouVar = (ou) obj;
                ouVar.b0 = i10;
                ouVar.c0 = 0.0f;
                View view = ouVar.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.s1) obj).G;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                AnimatorSet animatorSet2 = t2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = t2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(t2Var, i10);
                    }
                    org.telegram.messenger.g0.h3(new lg.n(this, 25));
                }
                hs.e().k(99, 512);
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
                ((u7) obj).a[i10].setVisibility(8);
                break;
            case 9:
                ww wwVar = (ww) obj;
                wwVar.r.setVisibility(i10 == 1 ? 0 : 8);
                wwVar.h.setVisibility(i10 == 2 ? 0 : 8);
                wwVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 10:
                j40 j40Var = (j40) obj;
                if (i10 == j40Var.t0) {
                    j40Var.x.setRotationY(0.0f);
                    j40Var.r0 = true;
                    j40Var.c0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = j40Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    a8.b(sb2.toString());
                    j40.m(j40Var);
                    break;
                }
                break;
            case 11:
                qf0 qf0Var = (qf0) obj;
                qf0Var.I = null;
                qf0Var.Q.e1.delete(i10);
                break;
            case 12:
                tp tpVar = (tp) obj;
                ((wi0) tpVar.d).b.remove(i10);
                wi0 wi0Var = (wi0) tpVar.d;
                wi0Var.d = true;
                wi0Var.a.invalidate();
                break;
            case 13:
                yq0 yq0Var = (yq0) obj;
                yq0Var.e.S1.remove(i10);
                yq0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj;
                l0Var.y = -1;
                l0Var.w = i10;
                l0Var.s = 0.0f;
                l0Var.V = null;
                l0Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ww wwVar = (ww) this.c;
                wwVar.r.setVisibility(0);
                wwVar.h.setVisibility(0);
                wwVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
