package i2;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j implements x0 {
    public final u1 a;
    public final s0 b;
    public b c;
    public x0 d;
    public boolean e = true;
    public boolean f;

    public j(s0 s0Var, e2.g0 g0Var) {
        this.b = s0Var;
        this.a = new u1(g0Var);
    }

    @Override // i2.x0
    public final long a() {
        if (this.e) {
            return this.a.a();
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.a();
    }

    @Override // i2.x0
    public final boolean b() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        x0 x0Var = this.d;
        x0Var.getClass();
        return x0Var.b();
    }

    public final void c(b bVar) {
        x0 x0Var;
        x0 i10 = bVar.i();
        if (i10 == null || i10 == (x0Var = this.d)) {
            return;
        }
        if (x0Var != null) {
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.d = i10;
        this.c = bVar;
        i10.f((b2.a1) this.a.e);
    }

    @Override // i2.x0
    public final void f(b2.a1 a1Var) {
        x0 x0Var = this.d;
        if (x0Var != null) {
            x0Var.f(a1Var);
            a1Var = this.d.h();
        }
        this.a.f(a1Var);
    }

    @Override // i2.x0
    public final b2.a1 h() {
        x0 x0Var = this.d;
        return x0Var != null ? x0Var.h() : (b2.a1) this.a.e;
    }
}
