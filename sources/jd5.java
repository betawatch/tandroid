// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jd5 extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ kd5 e;

    public jd5(kd5 kd5Var, float[] fArr, float f, float f2, boolean z) {
        this.e = kd5Var;
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
        this.e.a.b.l = gl.R1(this.b, this.c, 1.0f);
        uq4 uq4Var = this.e.a.b;
        uq4Var.f = (f * 360.0f * (this.d ? 1 : -1)) + uq4Var.f;
        this.e.a.b.b();
        kd5 kd5Var = this.e;
        kd5Var.a(kd5Var.a.b.l);
        this.e.a.j(750L);
    }
}
