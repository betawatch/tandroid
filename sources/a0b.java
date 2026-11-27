// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a0b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ b0b e;

    public a0b(b0b b0bVar, int i, int i2, int i3, int i4) {
        this.e = b0bVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f = vm2.f(1.0f, this.a, this.b);
        b0b b0bVar = this.e;
        b0bVar.r = f;
        b0bVar.s = vm2.f(1.0f, this.c, this.d);
        b0bVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{b0bVar.r, b0bVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        b0bVar.invalidate();
    }
}
