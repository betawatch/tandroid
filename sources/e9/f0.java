package e9;

import java.util.Collection;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class f0 extends q0 {
    @Override // e9.q0
    public final i0 d() {
        throw new AssertionError("should never be called");
    }

    @Override // e9.q0
    /* renamed from: e */
    public final i0 values() {
        w1 w1Var = ((w1) this).n;
        y0 y0Var = w1Var.b;
        if (y0Var != null) {
            return y0Var;
        }
        a2 c10 = w1Var.c();
        w1Var.b = c10;
        return c10;
    }

    @Override // e9.q0, java.util.Map
    public final Collection values() {
        w1 w1Var = ((w1) this).n;
        y0 y0Var = w1Var.b;
        if (y0Var != null) {
            return y0Var;
        }
        a2 c10 = w1Var.c();
        w1Var.b = c10;
        return c10;
    }
}
