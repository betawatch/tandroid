package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ya extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ab e;

    public ya(ab abVar, int i10, int i11, int i12, int i13) {
        this.e = abVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        ab abVar = this.e;
        abVar.r = d;
        abVar.s = i0.a.d(1.0f, this.c, this.d);
        abVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{abVar.r, abVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        abVar.invalidate();
    }
}
