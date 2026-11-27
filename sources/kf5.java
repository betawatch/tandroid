// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kf5 extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ lf5 e;

    public kf5(lf5 lf5Var, float[] fArr, float f, float f2, boolean z) {
        this.e = lf5Var;
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
        this.e.a.b.l = hl.R1(this.b, this.c, 1.0f);
        ys4 ys4Var = this.e.a.b;
        ys4Var.f = (f * 360.0f * (this.d ? 1 : -1)) + ys4Var.f;
        this.e.a.b.b();
        lf5 lf5Var = this.e;
        lf5Var.a(lf5Var.a.b.l);
        this.e.a.j(750L);
    }
}
