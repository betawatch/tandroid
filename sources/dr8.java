// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dr8 implements iz4, ty4 {
    public final km0 a;

    public dr8(km0 km0Var) {
        this.a = km0Var;
    }

    @Override // ty4
    public final int a() {
        return ((ty4) b()).a();
    }

    public final iz4 b() {
        hz4 f = sy4.f();
        boolean z = f.a;
        km0 km0Var = this.a;
        return !z ? km0Var.c : (!f.b || Build.VERSION.SDK_INT < 33) ? km0Var.b : km0Var.a;
    }

    @Override // ty4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        ((ty4) b()).d(f, f2, i, canvas, rectF);
    }

    @Override // iz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        b().e(f, f2, f3, f4, canvas);
    }

    @Override // ty4
    public final int f() {
        return ((ty4) b()).f();
    }

    @Override // ty4
    public final int g() {
        return ((ty4) b()).g();
    }

    @Override // ty4
    public final boolean h() {
        iz4 b = b();
        return (b instanceof ty4) && ((ty4) b).h();
    }
}
