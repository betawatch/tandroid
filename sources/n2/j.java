package n2;

import ag.o0;
import e2.l0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final g0 b;
    public final CopyOnWriteArrayList c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new li.s(this, iVar.b, dVar, 10));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new h(this, iVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new o0(this, iVar.b, i10, 8));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new li.s(this, iVar.b, exc, 9));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            l0.W(iVar.a, new h(this, iVar.b, 0));
        }
    }
}
