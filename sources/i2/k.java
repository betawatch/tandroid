package i2;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class k implements w0 {
    public final t1 a;
    public final r0 b;
    public b c;
    public w0 d;
    public boolean e = true;
    public boolean f;

    public k(r0 r0Var, e2.g0 g0Var) {
        this.b = r0Var;
        this.a = new t1(g0Var);
    }

    @Override // i2.w0
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override // i2.w0
    public final boolean b() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        w0 w0Var = this.d;
        w0Var.getClass();
        return w0Var.b();
    }

    public final void c(b bVar) {
        w0 w0Var;
        w0 i10 = bVar.i();
        if (i10 == null || i10 == (w0Var = this.d)) {
            return;
        }
        if (w0Var != null) {
            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.d = i10;
        this.c = bVar;
        i10.f((b2.z0) this.a.e);
    }

    @Override // i2.w0
    public final void f(b2.z0 z0Var) {
        w0 w0Var = this.d;
        if (w0Var != null) {
            w0Var.f(z0Var);
            z0Var = this.d.h();
        }
        this.a.f(z0Var);
    }

    @Override // i2.w0
    public final b2.z0 h() {
        w0 w0Var = this.d;
        return w0Var != null ? w0Var.h() : (b2.z0) this.a.e;
    }
}
