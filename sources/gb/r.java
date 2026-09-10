package gb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class r extends db.u {
    public static final p c = new p(db.t.a, 1);
    public final db.g a;
    public final db.t b;

    public r(db.g gVar, db.t tVar) {
        this.a = gVar;
        this.b = tVar;
    }

    public final Serializable a(lb.a aVar, int i10) {
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
            throw new IllegalStateException("Unexpected token: ".concat(hc.b.E(i10)));
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
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
            arrayList = new fb.m(true);
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
                    arrayList2 = new fb.m(true);
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

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        db.g gVar = this.a;
        gVar.getClass();
        db.u b10 = gVar.b(new kb.a(cls));
        if (!(b10 instanceof r)) {
            b10.write(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }
}
