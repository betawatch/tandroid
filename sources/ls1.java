// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ls1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mu1 d;

    public ls1(mu1 mu1Var, boolean z, boolean z2, boolean z3) {
        this.d = mu1Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mu1 mu1Var = this.d;
        mu1Var.b3 = null;
        mu1Var.Y2.setVisibility(this.a ? 0 : 4);
        mu1Var.a3.setVisibility(this.b ? 0 : 4);
        mu1Var.Z2.setVisibility(this.c ? 0 : 4);
    }
}
