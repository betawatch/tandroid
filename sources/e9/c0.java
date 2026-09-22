package e9;

import java.util.Collection;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
