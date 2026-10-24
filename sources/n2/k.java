package n2;

import e2.m0;
import ig.d2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.h0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final h0 b;
    public final CopyOnWriteArrayList c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, h0 h0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = h0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.a, new d2(this, jVar.b, dVar, 13));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.l] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.a, new i(this, jVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.a, new ah.o(this, jVar.b, i10, 21));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.a, new d2(this, jVar.b, exc, 12));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.l] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.a, new i(this, jVar.b, 0));
        }
    }
}
