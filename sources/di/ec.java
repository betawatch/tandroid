package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ec extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gc e;

    public ec(gc gcVar, int i7, int i10, int i11, int i12) {
        this.e = gcVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        gc gcVar = this.e;
        gcVar.r = f10;
        gcVar.s = i0.a.f(1.0f, this.c, this.d);
        gcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gcVar.r, gcVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        gcVar.invalidate();
    }
}
