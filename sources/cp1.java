// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cp1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zu1 d;

    public cp1(zu1 zu1Var, boolean z, boolean z2, boolean z3) {
        this.d = zu1Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zu1 zu1Var = this.d;
        zu1Var.b3 = null;
        zu1Var.Y2.setVisibility(this.a ? 0 : 4);
        zu1Var.a3.setVisibility(this.b ? 0 : 4);
        zu1Var.Z2.setVisibility(this.c ? 0 : 4);
    }
}
