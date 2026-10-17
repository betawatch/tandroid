package i2;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class i implements u0 {
    public final s1 a;
    public final p0 b;
    public b c;
    public u0 d;
    public boolean e = true;
    public boolean f;

    public i(p0 p0Var, e2.g0 g0Var) {
        this.b = p0Var;
        this.a = new s1(g0Var);
    }

    @Override // i2.u0
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        u0 u0Var = this.d;
        u0Var.getClass();
        return u0Var.a();
    }

    @Override // i2.u0
    public final boolean b() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        u0 u0Var = this.d;
        u0Var.getClass();
        return u0Var.b();
    }

    public final void c(b bVar) {
        u0 u0Var;
        u0 i10 = bVar.i();
        if (i10 == null || i10 == (u0Var = this.d)) {
            return;
        }
        if (u0Var != null) {
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.d = i10;
        this.c = bVar;
        i10.f((b2.z0) this.a.e);
    }

    @Override // i2.u0
    public final void f(b2.z0 z0Var) {
        u0 u0Var = this.d;
        if (u0Var != null) {
            u0Var.f(z0Var);
            z0Var = this.d.h();
        }
        this.a.f(z0Var);
    }

    @Override // i2.u0
    public final b2.z0 h() {
        u0 u0Var = this.d;
        return u0Var != null ? u0Var.h() : (b2.z0) this.a.e;
    }
}
