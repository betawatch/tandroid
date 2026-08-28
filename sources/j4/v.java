package j4;

import h3.p2;
import h3.q2;
import h3.r2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v extends o {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public v(r2 r2Var, Object obj, Object obj2) {
        super(r2Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // j4.o, h3.r2
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // j4.o, h3.r2
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        this.b.f(i9, p2Var, z10);
        if (d5.f0.a(p2Var.b, this.d) && z10) {
            p2Var.b = e;
        }
        return p2Var;
    }

    @Override // j4.o, h3.r2
    public final Object l(int i9) {
        Object l10 = this.b.l(i9);
        return d5.f0.a(l10, this.d) ? e : l10;
    }

    @Override // j4.o, h3.r2
    public final q2 m(int i9, q2 q2Var, long j10) {
        this.b.m(i9, q2Var, j10);
        if (d5.f0.a(q2Var.a, this.c)) {
            q2Var.a = q2.D;
        }
        return q2Var;
    }
}
