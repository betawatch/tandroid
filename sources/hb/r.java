package hb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class r extends eb.u {
    public static final p c = new p(eb.t.a, 1);
    public final eb.g a;
    public final eb.t b;

    public r(eb.g gVar, eb.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(mb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 == 5) {
            return aVar.v();
        }
        if (c10 == 6) {
            return this.b.a(aVar);
        }
        if (c10 == 7) {
            return Boolean.valueOf(aVar.n());
        }
        if (c10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(i2.d.E(i10)));
        }
        aVar.t();
        return null;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (c10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new gb.m(true);
        }
        if (arrayList == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = arrayList instanceof Map ? aVar.r() : null;
                int x11 = aVar.x();
                int c11 = m1.j.c(x11);
                if (c11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (c11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new gb.m(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x11);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(r10, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        eb.g gVar = this.a;
        gVar.getClass();
        eb.u b10 = gVar.b(new lb.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
