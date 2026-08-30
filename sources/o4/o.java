package o4;

import j3.m2;
import j3.n2;
import j3.o2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o extends h {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public o(o2 o2Var, Object obj, Object obj2) {
        super(o2Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // o4.h, j3.o2
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // o4.h, j3.o2
    public final m2 f(int i10, m2 m2Var, boolean z4) {
        this.b.f(i10, m2Var, z4);
        if (h5.d0.a(m2Var.b, this.d) && z4) {
            m2Var.b = e;
        }
        return m2Var;
    }

    @Override // o4.h, j3.o2
    public final Object l(int i10) {
        Object l10 = this.b.l(i10);
        return h5.d0.a(l10, this.d) ? e : l10;
    }

    @Override // o4.h, j3.o2
    public final n2 m(int i10, n2 n2Var, long j10) {
        this.b.m(i10, n2Var, j10);
        if (h5.d0.a(n2Var.a, this.c)) {
            n2Var.a = n2.E;
        }
        return n2Var;
    }
}
