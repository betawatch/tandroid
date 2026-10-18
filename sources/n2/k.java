package n2;

import e2.m0;
import ig.e2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.g0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final g0 b;
    public final CopyOnWriteArrayList c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, g0 g0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = g0Var;
    }

    public final void a(oa.d dVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            m0.W(jVar.a, new e2(this, jVar.b, dVar, 13));
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
            m0.W(jVar.a, new e2(this, jVar.b, exc, 12));
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
