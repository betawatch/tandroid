package gb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class u0 extends db.u {
    public static db.i a(lb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 == 5) {
            return new db.m(aVar.v());
        }
        if (c10 == 6) {
            return new db.m(new fb.h(aVar.v()));
        }
        if (c10 == 7) {
            return new db.m(Boolean.valueOf(aVar.n()));
        }
        if (c10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(hc.b.E(i10)));
        }
        aVar.t();
        return db.k.a;
    }

    public static void b(db.i iVar, lb.b bVar) {
        if (iVar == null || (iVar instanceof db.k)) {
            bVar.i();
            return;
        }
        boolean z10 = iVar instanceof db.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            db.m mVar = (db.m) iVar;
            Serializable serializable = mVar.a;
            if (serializable instanceof Number) {
                bVar.q(mVar.r());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.s(mVar.p());
                return;
            } else {
                bVar.r(mVar.n());
                return;
            }
        }
        boolean z11 = iVar instanceof db.h;
        if (!z11) {
            if (!(iVar instanceof db.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((fb.k) iVar.i().a.entrySet()).iterator();
            while (((fb.j) it).hasNext()) {
                fb.l b10 = ((fb.j) it).b();
                bVar.g((String) b10.getKey());
                b((db.i) b10.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((db.h) iVar).a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((db.i) obj, bVar);
        }
        bVar.e();
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        db.i hVar;
        db.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                db.i iVar = (db.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + hc.b.E(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int c10 = m1.j.c(x11);
        if (c10 == 0) {
            aVar.a();
            hVar = new db.h();
        } else if (c10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new db.l();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = hVar instanceof db.l ? aVar.r() : null;
                int x12 = aVar.x();
                int c11 = m1.j.c(x12);
                if (c11 == 0) {
                    aVar.a();
                    hVar2 = new db.h();
                } else if (c11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new db.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof db.h) {
                    ((db.h) hVar).a.add(hVar2);
                } else {
                    ((db.l) hVar).o(r10, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof db.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (db.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // db.u
    public final /* bridge */ /* synthetic */ void write(lb.b bVar, Object obj) {
        b((db.i) obj, bVar);
    }
}
