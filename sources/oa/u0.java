package oa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class u0 extends la.u {
    public static la.i a(ta.a aVar, int i9) {
        int b10 = m1.j.b(i9);
        if (b10 == 5) {
            return new la.m(aVar.v());
        }
        if (b10 == 6) {
            return new la.m(new na.i(aVar.v()));
        }
        if (b10 == 7) {
            return new la.m(Boolean.valueOf(aVar.n()));
        }
        if (b10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(ta.b.k(i9)));
        }
        aVar.t();
        return la.k.a;
    }

    public static void b(la.i iVar, ta.c cVar) {
        if (iVar == null || (iVar instanceof la.k)) {
            cVar.i();
            return;
        }
        boolean z10 = iVar instanceof la.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            la.m mVar = (la.m) iVar;
            Serializable serializable = mVar.a;
            if (serializable instanceof Number) {
                cVar.q(mVar.r());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.s(mVar.p());
                return;
            } else {
                cVar.r(mVar.n());
                return;
            }
        }
        boolean z11 = iVar instanceof la.h;
        if (!z11) {
            if (!(iVar instanceof la.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            cVar.c();
            Iterator it = ((na.k) iVar.i().a.entrySet()).iterator();
            while (((na.j) it).hasNext()) {
                na.l b10 = ((na.j) it).b();
                cVar.g((String) b10.getKey());
                b((la.i) b10.getValue(), cVar);
            }
            cVar.f();
            return;
        }
        cVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((la.h) iVar).a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            b((la.i) obj, cVar);
        }
        cVar.e();
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        la.i hVar;
        la.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                la.i iVar = (la.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + ta.b.k(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int b10 = m1.j.b(x11);
        if (b10 == 0) {
            aVar.a();
            hVar = new la.h();
        } else if (b10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new la.l();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = hVar instanceof la.l ? aVar.r() : null;
                int x12 = aVar.x();
                int b11 = m1.j.b(x12);
                if (b11 == 0) {
                    aVar.a();
                    hVar2 = new la.h();
                } else if (b11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new la.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof la.h) {
                    ((la.h) hVar).a.add(hVar2);
                } else {
                    ((la.l) hVar).o(r10, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof la.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (la.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // la.u
    public final /* bridge */ /* synthetic */ void write(ta.c cVar, Object obj) {
        b((la.i) obj, cVar);
    }
}
