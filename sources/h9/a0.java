package h9;

import java.util.Collection;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class a0 extends l0 {
    @Override // h9.l0
    public final d0 e() {
        throw new AssertionError("should never be called");
    }

    @Override // h9.l0
    /* renamed from: f */
    public final d0 values() {
        s1 s1Var = ((s1) this).n;
        t0 t0Var = s1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        w1 d = s1Var.d();
        s1Var.b = d;
        return d;
    }

    @Override // h9.l0, java.util.Map
    public final Collection values() {
        s1 s1Var = ((s1) this).n;
        t0 t0Var = s1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        w1 d = s1Var.d();
        s1Var.b = d;
        return d;
    }
}
