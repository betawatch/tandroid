package a3;

import android.content.Context;
import b2.v0;
import i2.p1;
import i2.r0;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q implements r0 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public q(i2.n0 n0Var, e2.x xVar) {
        this.d = n0Var;
        this.c = new p1(xVar);
        this.a = true;
    }

    @Override // i2.r0
    public long a() {
        if (this.a) {
            return ((p1) this.c).a();
        }
        r0 r0Var = (r0) this.f;
        r0Var.getClass();
        return r0Var.a();
    }

    @Override // i2.r0
    public boolean b() {
        if (this.a) {
            ((p1) this.c).getClass();
            return false;
        }
        r0 r0Var = (r0) this.f;
        r0Var.getClass();
        return r0Var.b();
    }

    public void c(i2.f fVar) {
        r0 r0Var;
        r0 i10 = fVar.i();
        if (i10 == null || i10 == (r0Var = (r0) this.f)) {
            return;
        }
        if (r0Var != null) {
            throw new i2.n(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.f = i10;
        this.e = fVar;
        i10.f((v0) ((p1) this.c).e);
    }

    @Override // i2.r0
    public void f(v0 v0Var) {
        r0 r0Var = (r0) this.f;
        if (r0Var != null) {
            r0Var.f(v0Var);
            v0Var = ((r0) this.f).h();
        }
        ((p1) this.c).f(v0Var);
    }

    @Override // i2.r0
    public v0 h() {
        r0 r0Var = (r0) this.f;
        return r0Var != null ? r0Var.h() : (v0) ((p1) this.c).e;
    }

    public q(Context context, a0 a0Var) {
        this.c = context.getApplicationContext();
        this.d = a0Var;
        this.f = e2.x.a;
    }
}
