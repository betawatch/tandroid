package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ w1 c;
    public final /* synthetic */ c3 d;

    public s2(c3 c3Var, int i9, int i10, w1 w1Var) {
        this.d = c3Var;
        this.a = i9;
        this.b = i10;
        this.c = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        c3 c3Var = this.d;
        c3Var.M = d;
        c3Var.h();
        b3 b3Var = c3Var.e;
        b3Var.invalidate();
        z2 z2Var = c3Var.S;
        z2Var.setBackgroundColor(c3Var.M);
        w1 w1Var = this.c;
        w1Var.b(z2Var, 1.0f);
        c3Var.a = w1Var.a(f6.Ii);
        b3Var.invalidate();
    }
}
