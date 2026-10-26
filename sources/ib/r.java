package ib;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r extends fb.u {
    public static final p c = new p(fb.t.a, 1);
    public final fb.g a;
    public final fb.t b;

    public r(fb.g gVar, fb.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(nb.a aVar, int i10) {
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
            throw new IllegalStateException("Unexpected token: ".concat(ic.a.C(i10)));
        }
        aVar.t();
        return null;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int x9 = aVar.x();
        int c10 = m1.j.c(x9);
        if (c10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (c10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new hb.m(true);
        }
        if (arrayList == null) {
            return a(aVar, x9);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r6 = arrayList instanceof Map ? aVar.r() : null;
                int x10 = aVar.x();
                int c11 = m1.j.c(x10);
                if (c11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (c11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new hb.m(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x10);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(r6, arrayList2);
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

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        fb.g gVar = this.a;
        gVar.getClass();
        fb.u b10 = gVar.b(new mb.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
