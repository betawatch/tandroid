package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class fe extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ he e;

    public fe(he heVar, int i10, int i11, int i12, int i13) {
        this.e = heVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.a, this.b);
        he heVar = this.e;
        heVar.r = f7;
        heVar.s = i0.b.f(1.0f, this.c, this.d);
        heVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{heVar.r, heVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        heVar.invalidate();
    }
}
