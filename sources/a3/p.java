package a3;

import android.content.Context;
import b2.v0;
import i2.o0;
import i2.q1;
import i2.s0;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p implements s0 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public p(o0 o0Var, e2.x xVar) {
        this.d = o0Var;
        this.c = new q1(xVar);
        this.a = true;
    }

    @Override // i2.s0
    public long a() {
        if (this.a) {
            return ((q1) this.c).a();
        }
        s0 s0Var = (s0) this.f;
        s0Var.getClass();
        return s0Var.a();
    }

    @Override // i2.s0
    public boolean b() {
        if (this.a) {
            ((q1) this.c).getClass();
            return false;
        }
        s0 s0Var = (s0) this.f;
        s0Var.getClass();
        return s0Var.b();
    }

    public void c(i2.f fVar) {
        s0 s0Var;
        s0 i10 = fVar.i();
        if (i10 == null || i10 == (s0Var = (s0) this.f)) {
            return;
        }
        if (s0Var != null) {
            throw new i2.o(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
        }
        this.f = i10;
        this.e = fVar;
        i10.f((v0) ((q1) this.c).e);
    }

    @Override // i2.s0
    public void f(v0 v0Var) {
        s0 s0Var = (s0) this.f;
        if (s0Var != null) {
            s0Var.f(v0Var);
            v0Var = ((s0) this.f).h();
        }
        ((q1) this.c).f(v0Var);
    }

    @Override // i2.s0
    public v0 h() {
        s0 s0Var = (s0) this.f;
        return s0Var != null ? s0Var.h() : (v0) ((q1) this.c).e;
    }

    public p(Context context, z zVar) {
        this.c = context.getApplicationContext();
        this.d = zVar;
        this.f = e2.x.a;
    }
}
