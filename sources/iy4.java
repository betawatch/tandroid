// default package

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class iy4 implements mz4, wy4 {
    public final int a;
    public final /* synthetic */ jy4 b;

    public iy4(jy4 jy4Var, int i) {
        this.b = jy4Var;
        this.a = i;
    }

    @Override // wy4
    public final int a() {
        boolean c = qd4.c(this.a);
        jy4 jy4Var = this.b;
        return c ? jy4Var.s : jy4Var.q;
    }

    @Override // wy4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        this.b.b(this.a, canvas, rectF, i, f, f2);
    }

    @Override // mz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        this.b.c(canvas, this.a, f, f2, f3, f4);
    }

    @Override // wy4
    public final int f() {
        boolean c = qd4.c(this.a);
        jy4 jy4Var = this.b;
        return c ? jy4Var.n : jy4Var.m;
    }

    @Override // wy4
    public final int g() {
        boolean c = qd4.c(this.a);
        jy4 jy4Var = this.b;
        return c ? jy4Var.r : jy4Var.p;
    }

    @Override // wy4
    public final boolean h() {
        return true;
    }
}
