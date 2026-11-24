// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cp8 implements gx4, rw4 {
    public final kl0 a;

    public cp8(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // rw4
    public final int a() {
        return ((rw4) b()).a();
    }

    public final gx4 b() {
        fx4 f = qw4.f();
        boolean z = f.a;
        kl0 kl0Var = this.a;
        return !z ? kl0Var.c : (!f.b || Build.VERSION.SDK_INT < 33) ? kl0Var.b : kl0Var.a;
    }

    @Override // rw4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        ((rw4) b()).d(f, f2, i, canvas, rectF);
    }

    @Override // gx4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        b().e(f, f2, f3, f4, canvas);
    }

    @Override // rw4
    public final int f() {
        return ((rw4) b()).f();
    }

    @Override // rw4
    public final int g() {
        return ((rw4) b()).g();
    }

    @Override // rw4
    public final boolean h() {
        gx4 b = b();
        return (b instanceof rw4) && ((rw4) b).h();
    }
}
