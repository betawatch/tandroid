package g9;

import java.util.Collection;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a0 extends l0 {
    @Override // g9.l0
    public final d0 e() {
        throw new AssertionError("should never be called");
    }

    @Override // g9.l0
    /* renamed from: f */
    public final d0 values() {
        r1 r1Var = ((r1) this).n;
        t0 t0Var = r1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        v1 d = r1Var.d();
        r1Var.b = d;
        return d;
    }

    @Override // g9.l0, java.util.Map
    public final Collection values() {
        r1 r1Var = ((r1) this).n;
        t0 t0Var = r1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        v1 d = r1Var.d();
        r1Var.b = d;
        return d;
    }
}
