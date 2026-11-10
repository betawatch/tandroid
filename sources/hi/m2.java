package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import li.s4;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.messenger.wu;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.xp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class m2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) this.c).F;
                int i7 = this.b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                AnimatorSet animatorSet2 = w2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.z0 = null;
                    w2Var.A0 = 0;
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
                a3 a3Var = (a3) obj;
                a3Var.Q.setColor(i10);
                a3Var.F();
                a3Var.f.invalidate();
                org.telegram.ui.b3 b3Var = a3Var.Y0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.g0.B(a3Var.Q.getColor()) <= 0.721f, false);
                    a3Var.Y0.setBackgroundColor(a3Var.Q.getColor());
                }
                a3Var.K();
                break;
            case 1:
                c4 c4Var = (c4) obj;
                s2 s2Var = c4Var.n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(i10);
                }
                if (animator == c4Var.r) {
                    c4Var.r = null;
                    break;
                }
                break;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.W = i10;
                s4Var.a0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                break;
            case 3:
                wu wuVar = (wu) obj;
                wuVar.a0 = i10;
                wuVar.b0 = 0.0f;
                View view = wuVar.V;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) obj).F;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                AnimatorSet animatorSet2 = w2Var.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.z0 = null;
                    w2Var.A0 = 0;
                    DialogInterface.OnClickListener onClickListener = w2Var.K;
                    if (onClickListener != null) {
                        onClickListener.onClick(w2Var, i10);
                    }
                    org.telegram.messenger.g0.h3(new l2.a0(this, 21));
                }
                qs.e().k(99, 512);
                break;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i10);
                }
                f4Var.d0 = null;
                break;
            case 7:
                ((h6) obj).u(i10);
                break;
            case 8:
                ((v7) obj).a[i10].setVisibility(8);
                break;
            case 9:
                xw xwVar = (xw) obj;
                xwVar.r.setVisibility(i10 == 1 ? 0 : 8);
                xwVar.h.setVisibility(i10 == 2 ? 0 : 8);
                xwVar.n.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 10:
                n40 n40Var = (n40) obj;
                if (i10 == n40Var.t0) {
                    n40Var.x.setRotationY(0.0f);
                    n40Var.r0 = true;
                    n40Var.c0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = n40Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    a8.b(sb2.toString());
                    n40.n(n40Var);
                    break;
                }
                break;
            case 11:
                nf0 nf0Var = (nf0) obj;
                nf0Var.H = null;
                nf0Var.P.d1.delete(i10);
                break;
            case 12:
                xp xpVar = (xp) obj;
                ((si0) xpVar.d).b.remove(i10);
                si0 si0Var = (si0) xpVar.d;
                si0Var.d = true;
                si0Var.a.invalidate();
                break;
            case 13:
                zq0 zq0Var = (zq0) obj;
                zq0Var.e.R1.remove(i10);
                zq0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) obj;
                z0Var.y = -1;
                z0Var.w = i10;
                z0Var.s = 0.0f;
                z0Var.U = null;
                z0Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                xw xwVar = (xw) this.c;
                xwVar.r.setVisibility(0);
                xwVar.h.setVisibility(0);
                xwVar.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
