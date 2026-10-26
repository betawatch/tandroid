package ib;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class u0 extends fb.u {
    public static fb.i a(nb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 == 5) {
            return new fb.m(aVar.v());
        }
        if (c10 == 6) {
            return new fb.m(new hb.i(aVar.v()));
        }
        if (c10 == 7) {
            return new fb.m(Boolean.valueOf(aVar.n()));
        }
        if (c10 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(ic.a.C(i10)));
        }
        aVar.t();
        return fb.k.a;
    }

    public static void b(fb.i iVar, nb.b bVar) {
        if (iVar == null || (iVar instanceof fb.k)) {
            bVar.i();
            return;
        }
        boolean z10 = iVar instanceof fb.m;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            fb.m mVar = (fb.m) iVar;
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
        boolean z11 = iVar instanceof fb.h;
        if (!z11) {
            if (!(iVar instanceof fb.l)) {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
            bVar.c();
            Iterator it = ((hb.k) iVar.h().a.entrySet()).iterator();
            while (((hb.j) it).hasNext()) {
                hb.l b10 = ((hb.j) it).b();
                bVar.g((String) b10.getKey());
                b((fb.i) b10.getValue(), bVar);
            }
            bVar.f();
            return;
        }
        bVar.b();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Array: " + iVar);
        }
        ArrayList arrayList = ((fb.h) iVar).a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b((fb.i) obj, bVar);
        }
        bVar.e();
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        fb.i hVar;
        fb.i hVar2;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x9 = lVar.x();
            if (x9 != 5 && x9 != 2 && x9 != 4 && x9 != 10) {
                fb.i iVar = (fb.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + ic.a.C(x9) + " when reading a JsonElement.");
        }
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 == 0) {
            aVar.a();
            hVar = new fb.h();
        } else if (c10 != 2) {
            hVar = null;
        } else {
            aVar.b();
            hVar = new fb.l();
        }
        if (hVar == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                String r6 = hVar instanceof fb.l ? aVar.r() : null;
                int x11 = aVar.x();
                int c11 = m1.j.c(x11);
                if (c11 == 0) {
                    aVar.a();
                    hVar2 = new fb.h();
                } else if (c11 != 2) {
                    hVar2 = null;
                } else {
                    aVar.b();
                    hVar2 = new fb.l();
                }
                boolean z10 = hVar2 != null;
                if (hVar2 == null) {
                    hVar2 = a(aVar, x11);
                }
                if (hVar instanceof fb.h) {
                    ((fb.h) hVar).a.add(hVar2);
                } else {
                    ((fb.l) hVar).n(r6, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof fb.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (fb.i) arrayDeque.removeLast();
            }
        }
    }

    @Override // fb.u
    public final /* bridge */ /* synthetic */ void write(nb.b bVar, Object obj) {
        b((fb.i) obj, bVar);
    }
}
