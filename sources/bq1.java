// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bq1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yv1 d;

    public bq1(yv1 yv1Var, boolean z, boolean z2, boolean z3) {
        this.d = yv1Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yv1 yv1Var = this.d;
        yv1Var.b3 = null;
        yv1Var.Y2.setVisibility(this.a ? 0 : 4);
        yv1Var.a3.setVisibility(this.b ? 0 : 4);
        yv1Var.Z2.setVisibility(this.c ? 0 : 4);
    }
}
