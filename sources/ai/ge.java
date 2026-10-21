package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class ge extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ie e;

    public ge(ie ieVar, int i10, int i11, int i12, int i13) {
        this.e = ieVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.a, this.b);
        ie ieVar = this.e;
        ieVar.r = f7;
        ieVar.s = i0.a.f(1.0f, this.c, this.d);
        ieVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ieVar.r, ieVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ieVar.invalidate();
    }
}
