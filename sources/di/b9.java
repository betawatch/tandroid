package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ b9(d9 d9Var, int i7) {
        this.a = i7;
        this.b = d9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p9 p9Var = this.b.r0;
                p9Var.X = 0.0f;
                p9.i(p9Var);
                break;
            default:
                p9 p9Var2 = this.b.r0;
                p9Var2.W = 0.0f;
                p9Var2.Z = 0.0f;
                p9.i(p9Var2);
                break;
        }
    }
}
