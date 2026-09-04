package e9;

import java.util.Collection;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class c0 extends k0 {
    @Override // e9.k0
    public final d0 d() {
        throw new AssertionError("should never be called");
    }

    @Override // e9.k0
    /* renamed from: e */
    public final d0 values() {
        z0 z0Var = ((z0) this).n;
        m0 m0Var = z0Var.b;
        if (m0Var != null) {
            return m0Var;
        }
        d1 c10 = z0Var.c();
        z0Var.b = c10;
        return c10;
    }

    @Override // e9.k0, java.util.Map
    public final Collection values() {
        z0 z0Var = ((z0) this).n;
        m0 m0Var = z0Var.b;
        if (m0Var != null) {
            return m0Var;
        }
        d1 c10 = z0Var.c();
        z0Var.b = c10;
        return c10;
    }
}
