package n2;

import ai.h0;
import e2.n0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jg.f1;
import u2.g0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public final void a(pa.d dVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new f1(this, iVar.b, dVar, 13));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new h(this, iVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new h0(this, iVar.b, i10, 22));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new f1(this, iVar.b, exc, 12));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            n0.W(iVar.a, new h(this, iVar.b, 0));
        }
    }
}
