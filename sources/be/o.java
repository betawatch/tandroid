package be;

import zd.c2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class o extends c {
    public final a w;

    public o(int i7, a aVar) {
        super(i7);
        this.w = aVar;
        if (aVar != a.a) {
            if (i7 < 1) {
                throw new IllegalArgumentException(jg.g.k(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Object obj, boolean z9) {
        a aVar = this.w;
        a aVar2 = a.c;
        gd.k kVar = gd.k.a;
        if (aVar == aVar2) {
            Object b10 = super.b(obj);
            return (!(b10 instanceof i) || (b10 instanceof h)) ? b10 : kVar;
        }
        Object obj2 = e.d;
        k kVar2 = (k) c.f.get(this);
        while (true) {
            long andIncrement = c.b.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean r10 = r(andIncrement, false);
            int i7 = e.b;
            long j10 = i7;
            long j11 = j3 / j10;
            int i10 = (int) (j3 % j10);
            if (kVar2.c != j11) {
                k c10 = c.c(this, j11, kVar2);
                if (c10 != null) {
                    kVar2 = c10;
                } else if (r10) {
                    return new h(o());
                }
            }
            int e10 = c.e(this, kVar2, i10, obj, j3, obj2, r10);
            if (e10 == 0) {
                kVar2.b();
                return kVar;
            }
            if (e10 == 1) {
                break;
            }
            if (e10 != 2) {
                if (e10 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e10 == 4) {
                    if (j3 < c.c.get(this)) {
                        kVar2.b();
                    }
                    return new h(o());
                }
                if (e10 == 5) {
                    kVar2.b();
                }
            } else {
                if (r10) {
                    kVar2.i();
                    return new h(o());
                }
                c2 c2Var = obj2 instanceof c2 ? (c2) obj2 : null;
                if (c2Var != null) {
                    c2Var.a(kVar2, i10 + i7);
                }
                j((kVar2.c * j10) + i10);
            }
        }
    }

    @Override // be.c, be.u
    public final Object a(id.c cVar, Object obj) {
        if (C(obj, true) instanceof h) {
            throw o();
        }
        return gd.k.a;
    }

    @Override // be.c, be.u
    public final Object b(Object obj) {
        return C(obj, false);
    }

    @Override // be.c
    public final boolean s() {
        return this.w == a.b;
    }
}
