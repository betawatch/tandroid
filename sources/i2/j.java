package i2;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class j implements v0 {
    public final t1 a;
    public final q0 b;
    public b c;
    public v0 d;
    public boolean e = true;
    public boolean f;

    public j(q0 q0Var, e2.g0 g0Var) {
        this.b = q0Var;
        this.a = new t1(g0Var);
    }

    @Override // i2.v0
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        v0 v0Var = this.d;
        v0Var.getClass();
        return v0Var.a();
    }

    @Override // i2.v0
    public final boolean b() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        v0 v0Var = this.d;
        v0Var.getClass();
        return v0Var.b();
    }

    public final void c(b bVar) {
        v0 v0Var;
        v0 i10 = bVar.i();
        if (i10 == null || i10 == (v0Var = this.d)) {
            return;
        }
        if (v0Var != null) {
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.d = i10;
        this.c = bVar;
        i10.f((b2.z0) this.a.e);
    }

    @Override // i2.v0
    public final void f(b2.z0 z0Var) {
        v0 v0Var = this.d;
        if (v0Var != null) {
            v0Var.f(z0Var);
            z0Var = this.d.h();
        }
        this.a.f(z0Var);
    }

    @Override // i2.v0
    public final b2.z0 h() {
        v0 v0Var = this.d;
        return v0Var != null ? v0Var.h() : (b2.z0) this.a.e;
    }
}
