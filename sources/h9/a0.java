package h9;

import java.util.Collection;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class a0 extends l0 {
    @Override // h9.l0
    public final d0 e() {
        throw new AssertionError("should never be called");
    }

    @Override // h9.l0
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

    @Override // h9.l0, java.util.Map
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
