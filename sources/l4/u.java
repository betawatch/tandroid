package l4;

import j3.p2;
import j3.q2;
import j3.r2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u extends n {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public u(r2 r2Var, Object obj, Object obj2) {
        super(r2Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // l4.n, j3.r2
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // l4.n, j3.r2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.b.f(i10, p2Var, z10);
        if (f5.d0.a(p2Var.b, this.d) && z10) {
            p2Var.b = e;
        }
        return p2Var;
    }

    @Override // l4.n, j3.r2
    public final Object l(int i10) {
        Object l10 = this.b.l(i10);
        return f5.d0.a(l10, this.d) ? e : l10;
    }

    @Override // l4.n, j3.r2
    public final q2 m(int i10, q2 q2Var, long j10) {
        this.b.m(i10, q2Var, j10);
        if (f5.d0.a(q2Var.a, this.c)) {
            q2Var.a = q2.D;
        }
        return q2Var;
    }
}
