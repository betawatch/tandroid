package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class he extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ je e;

    public he(je jeVar, int i10, int i11, int i12, int i13) {
        this.e = jeVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.a, this.b);
        je jeVar = this.e;
        jeVar.r = f7;
        jeVar.s = i0.a.f(1.0f, this.c, this.d);
        jeVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jeVar.r, jeVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jeVar.invalidate();
    }
}
