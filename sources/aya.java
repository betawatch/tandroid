// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aya extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ bya e;

    public aya(bya byaVar, int i, int i2, int i3, int i4) {
        this.e = byaVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f = on2.f(1.0f, this.a, this.b);
        bya byaVar = this.e;
        byaVar.r = f;
        byaVar.s = on2.f(1.0f, this.c, this.d);
        byaVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{byaVar.r, byaVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        byaVar.invalidate();
    }
}
