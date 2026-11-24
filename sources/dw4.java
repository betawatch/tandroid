// default package

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class dw4 implements gx4, rw4 {
    public final int a;
    public final /* synthetic */ ew4 b;

    public dw4(ew4 ew4Var, int i) {
        this.b = ew4Var;
        this.a = i;
    }

    @Override // rw4
    public final int a() {
        boolean c = tb4.c(this.a);
        ew4 ew4Var = this.b;
        return c ? ew4Var.s : ew4Var.q;
    }

    @Override // rw4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        this.b.b(this.a, canvas, rectF, i, f, f2);
    }

    @Override // gx4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        this.b.c(canvas, this.a, f, f2, f3, f4);
    }

    @Override // rw4
    public final int f() {
        boolean c = tb4.c(this.a);
        ew4 ew4Var = this.b;
        return c ? ew4Var.n : ew4Var.m;
    }

    @Override // rw4
    public final int g() {
        boolean c = tb4.c(this.a);
        ew4 ew4Var = this.b;
        return c ? ew4Var.r : ew4Var.p;
    }

    @Override // rw4
    public final boolean h() {
        return true;
    }
}
