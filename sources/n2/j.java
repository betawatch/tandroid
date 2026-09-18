package n2;

import ai.s1;
import e2.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.f0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
            d0.U(iVar.a, new s1(this, iVar.b, i10, 16));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d0.U(iVar.a, new gg.t(this, iVar.b, exc, 24));
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
