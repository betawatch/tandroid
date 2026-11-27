// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a8 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ b8 e;

    public a8(b8 b8Var, boolean z, int i, int i2, int i3) {
        this.e = b8Var;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.a ? 1.0f : 0.0f;
        int i = this.b;
        int i2 = this.c;
        int f2 = vm2.f(f, i, i2);
        b8 b8Var = this.e;
        b8Var.setTextColor(f2);
        b8Var.setIconColor(vm2.f(f, this.d, i2));
    }
}
