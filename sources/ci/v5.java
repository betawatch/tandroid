package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ v5(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q6 q6Var = this.b;
                q6Var.b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                break;
            case 1:
                this.b.p2.setTranslationY(0.0f);
                break;
            default:
                q6 q6Var2 = this.b;
                q6Var2.s2 = false;
                q6Var2.p2.setTranslationY(0.0f);
                q6Var2.w0();
                break;
        }
    }
}
