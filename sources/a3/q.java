package a3;

import android.content.Context;
import b2.v0;
import i2.p0;
import i2.r1;
import i2.t0;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class q implements t0 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public q(p0 p0Var, e2.x xVar) {
        this.d = p0Var;
        this.c = new r1(xVar);
        this.a = true;
    }

    @Override // i2.t0
    public long a() {
        if (this.a) {
            return ((r1) this.c).a();
        }
        t0 t0Var = (t0) this.f;
        t0Var.getClass();
        return t0Var.a();
    }

    @Override // i2.t0
    public boolean b() {
        if (this.a) {
            ((r1) this.c).getClass();
            return false;
        }
        t0 t0Var = (t0) this.f;
        t0Var.getClass();
        return t0Var.b();
    }

    public void c(i2.f fVar) {
        t0 t0Var;
        t0 i10 = fVar.i();
        if (i10 == null || i10 == (t0Var = (t0) this.f)) {
            return;
        }
        if (t0Var != null) {
            throw new i2.n(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.f = i10;
        this.e = fVar;
        i10.f((v0) ((r1) this.c).e);
    }

    @Override // i2.t0
    public void f(v0 v0Var) {
        t0 t0Var = (t0) this.f;
        if (t0Var != null) {
            t0Var.f(v0Var);
            v0Var = ((t0) this.f).h();
        }
        ((r1) this.c).f(v0Var);
    }

    @Override // i2.t0
    public v0 h() {
        t0 t0Var = (t0) this.f;
        return t0Var != null ? t0Var.h() : (v0) ((r1) this.c).e;
    }

    public q(Context context, a0 a0Var) {
        this.c = context.getApplicationContext();
        this.d = a0Var;
        this.f = e2.x.a;
    }
}
