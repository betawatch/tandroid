// default package

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class fy4 implements iz4, ty4 {
    public final int a;
    public final /* synthetic */ gy4 b;

    public fy4(gy4 gy4Var, int i) {
        this.b = gy4Var;
        this.a = i;
    }

    @Override // ty4
    public final int a() {
        boolean c = td4.c(this.a);
        gy4 gy4Var = this.b;
        return c ? gy4Var.s : gy4Var.q;
    }

    @Override // ty4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        this.b.b(this.a, canvas, rectF, i, f, f2);
    }

    @Override // iz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        this.b.c(canvas, this.a, f, f2, f3, f4);
    }

    @Override // ty4
    public final int f() {
        boolean c = td4.c(this.a);
        gy4 gy4Var = this.b;
        return c ? gy4Var.n : gy4Var.m;
    }

    @Override // ty4
    public final int g() {
        boolean c = td4.c(this.a);
        gy4 gy4Var = this.b;
        return c ? gy4Var.r : gy4Var.p;
    }

    @Override // ty4
    public final boolean h() {
        return true;
    }
}
