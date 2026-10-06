package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class a3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d2 c;
    public final /* synthetic */ l3 d;

    public a3(l3 l3Var, int i10, int i11, d2 d2Var) {
        this.d = l3Var;
        this.a = i10;
        this.b = i11;
        this.c = d2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        l3 l3Var = this.d;
        l3Var.Q = d;
        l3Var.h();
        k3 k3Var = l3Var.e;
        k3Var.invalidate();
        i3 i3Var = l3Var.W;
        i3Var.setBackgroundColor(l3Var.Q);
        d2 d2Var = this.c;
        d2Var.b(i3Var, 1.0f);
        l3Var.a = d2Var.a(i6.Ii);
        k3Var.invalidate();
    }
}
