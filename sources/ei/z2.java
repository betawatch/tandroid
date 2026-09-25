package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class z2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c2 c;
    public final /* synthetic */ k3 d;

    public z2(k3 k3Var, int i10, int i11, c2 c2Var) {
        this.d = k3Var;
        this.a = i10;
        this.b = i11;
        this.c = c2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        k3 k3Var = this.d;
        k3Var.Q = d;
        k3Var.h();
        j3 j3Var = k3Var.e;
        j3Var.invalidate();
        h3 h3Var = k3Var.W;
        h3Var.setBackgroundColor(k3Var.Q);
        c2 c2Var = this.c;
        c2Var.b(h3Var, 1.0f);
        k3Var.a = c2Var.a(h6.Ii);
        j3Var.invalidate();
    }
}
