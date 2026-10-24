package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
