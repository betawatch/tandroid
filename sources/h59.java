// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class h59 extends AnimatorListenerAdapter {
    public final /* synthetic */ g59 a;
    public final /* synthetic */ i59 b;

    public h59(i59 i59Var, g59 g59Var) {
        this.b = i59Var;
        this.a = g59Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g59 g59Var = this.a;
        g59Var.setLayerType(0, null);
        this.b.d.removeView(g59Var);
    }
}
