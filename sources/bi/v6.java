package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ v6(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r7 r7Var = this.b;
                r7Var.b2 = 0.0f;
                r7Var.Z1.setAlpha(1.0f);
                r7Var.Z1.setVisibility(8);
                r7Var.Z1.n();
                break;
            case 1:
                this.b.p2.setTranslationY(0.0f);
                break;
            default:
                r7 r7Var2 = this.b;
                r7Var2.s2 = false;
                r7Var2.p2.setTranslationY(0.0f);
                r7Var2.w0();
                break;
        }
    }
}
