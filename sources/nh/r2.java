package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v1 c;
    public final /* synthetic */ b3 d;

    public r2(b3 b3Var, int i10, int i11, v1 v1Var) {
        this.d = b3Var;
        this.a = i10;
        this.b = i11;
        this.c = v1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.b.d(1.0f, this.a, this.b);
        b3 b3Var = this.d;
        b3Var.M = d;
        b3Var.h();
        a3 a3Var = b3Var.e;
        a3Var.invalidate();
        y2 y2Var = b3Var.S;
        y2Var.setBackgroundColor(b3Var.M);
        v1 v1Var = this.c;
        v1Var.b(y2Var, 1.0f);
        b3Var.a = v1Var.a(g6.Ii);
        a3Var.invalidate();
    }
}
