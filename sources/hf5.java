// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hf5 extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ if5 e;

    public hf5(if5 if5Var, float[] fArr, float f, float f2, boolean z) {
        this.e = if5Var;
        this.a = fArr;
        this.b = f;
        this.c = f2;
        this.d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        this.e.a.b.l = gm.R1(this.b, this.c, 1.0f);
        vs4 vs4Var = this.e.a.b;
        vs4Var.f = (f * 360.0f * (this.d ? 1 : -1)) + vs4Var.f;
        this.e.a.b.b();
        if5 if5Var = this.e;
        if5Var.a(if5Var.a.b.l);
        this.e.a.j(750L);
    }
}
