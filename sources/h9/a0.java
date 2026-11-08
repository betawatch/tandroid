package h9;

import java.util.Collection;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
