package h9;

import java.util.Collection;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
