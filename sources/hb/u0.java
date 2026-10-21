package hb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class u0 extends eb.u {
    public static eb.i a(mb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 == 5) {
            return new eb.m(aVar.v());
        }
        if (c10 == 6) {
            return new eb.m(new gb.h(aVar.v()));
        }
        if (c10 == 7) {
            return new eb.m(Boolean.valueOf(aVar.n()));
        }
        if (c10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(i2.e.E(i10)));
        }
        aVar.t();
        return eb.k.a;
    }

    public static void b(eb.i iVar, mb.b bVar) {
        if (iVar == null || (iVar instanceof eb.k)) {
            bVar.i();
            return;
        }
        boolean z10 = iVar instanceof eb.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            eb.m mVar = (eb.m) iVar;
            Serializable serializable = mVar.a;
            if (serializable instanceof Number) {
                bVar.q(mVar.q());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.s(mVar.o());
                return;
            } else {
                bVar.r(mVar.m());
                return;
            }
        }
        boolean z11 = iVar instanceof eb.h;
        if (!z11) {
            if (!(iVar instanceof eb.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((gb.k) iVar.h().a.entrySet()).iterator();
            while (((gb.j) it).hasNext()) {
                gb.l b10 = ((gb.j) it).b();
                bVar.g((String) b10.getKey());
                b((eb.i) b10.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((eb.h) iVar).a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((eb.i) obj, bVar);
        }
        bVar.e();
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        eb.i hVar;
        eb.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                eb.i iVar = (eb.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + i2.e.E(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int c10 = m1.j.c(x11);
        if (c10 == 0) {
            aVar.a();
            hVar = new eb.h();
        } else if (c10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new eb.l();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r10 = hVar instanceof eb.l ? aVar.r() : null;
                int x12 = aVar.x();
                int c11 = m1.j.c(x12);
                if (c11 == 0) {
                    aVar.a();
                    hVar2 = new eb.h();
                } else if (c11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new eb.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof eb.h) {
                    ((eb.h) hVar).a.add(hVar2);
                } else {
                    ((eb.l) hVar).n(r10, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof eb.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (eb.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // eb.u
    public final /* bridge */ /* synthetic */ void write(mb.b bVar, Object obj) {
        b((eb.i) obj, bVar);
    }
}
