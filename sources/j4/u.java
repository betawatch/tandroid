package j4;

import h3.p2;
import h3.r2;
import h3.s2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u extends n {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public u(s2 s2Var, Object obj, Object obj2) {
        super(s2Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // j4.n, h3.s2
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // j4.n, h3.s2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        this.b.f(i10, p2Var, z10);
        if (d5.g0.a(p2Var.b, this.d) && z10) {
            p2Var.b = e;
        }
        return p2Var;
    }

    @Override // j4.n, h3.s2
    public final Object l(int i10) {
        Object l10 = this.b.l(i10);
        return d5.g0.a(l10, this.d) ? e : l10;
    }

    @Override // j4.n, h3.s2
    public final r2 m(int i10, r2 r2Var, long j10) {
        this.b.m(i10, r2Var, j10);
        if (d5.g0.a(r2Var.a, this.c)) {
            r2Var.a = r2.D;
        }
        return r2Var;
    }
}
