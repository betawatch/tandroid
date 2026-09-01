package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ b9(r8 r8Var, int i10) {
        this.a = i10;
        this.b = r8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.b.b;
                x6 x6Var = i9Var.r1;
                if (x6Var != null) {
                    x6Var.b();
                    i9Var.v.removeView(i9Var.r1);
                }
                i9Var.r1 = null;
                i9Var.P();
                break;
            default:
                super.onAnimationEnd(animator);
                x6 x6Var2 = this.b.b.r1;
                if (x6Var2 != null) {
                    x6Var2.a(true);
                    break;
                }
                break;
        }
    }
}
