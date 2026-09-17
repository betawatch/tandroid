package n2;

import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final f0 b;
    public final CopyOnWriteArrayList c;

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = f0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.a, new h(this, iVar.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.a, new h(this, iVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.a, new ah.p(this, iVar.b, i10, 17));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.a, new hg.t(this, iVar.b, exc, 24));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.k] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.a, new h(this, iVar.b, 0));
        }
    }
}
