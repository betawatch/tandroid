package h9;

import java.util.Collection;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
