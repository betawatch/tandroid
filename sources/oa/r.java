package oa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends la.u {
    public static final p c = new p(la.t.a, 1);
    public final la.g a;
    public final la.t b;

    public r(la.g gVar, la.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(ta.a aVar, int i9) {
        int b10 = m1.j.b(i9);
        if (b10 == 5) {
            return aVar.v();
        }
        if (b10 == 6) {
            return this.b.a(aVar);
        }
        if (b10 == 7) {
            return Boolean.valueOf(aVar.n());
        }
        if (b10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(ta.b.k(i9)));
        }
        aVar.t();
        return null;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (b10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new na.m(true);
        }
        if (arrayList == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = arrayList instanceof Map ? aVar.r() : null;
                int x11 = aVar.x();
                int b11 = m1.j.b(x11);
                if (b11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (b11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new na.m(true);
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

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        if (obj == null) {
            cVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        la.g gVar = this.a;
        gVar.getClass();
        la.u b10 = gVar.b(new sa.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(cVar, obj);
        } else {
            cVar.c();
            cVar.f();
        }
    }
}
