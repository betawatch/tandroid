package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final f0 b;
    public final CopyOnWriteArrayList c;

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i10, f0 f0Var) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = f0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.l] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.a, new i(this, jVar.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.l] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.a, new i(this, jVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.a, new s1(this, jVar.b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.a, new gg.t(this, jVar.b, exc, 27));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, n2.l] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            d0.U(jVar.a, new i(this, jVar.b, 0));
        }
    }
}
