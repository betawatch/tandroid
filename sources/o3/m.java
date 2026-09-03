package o3;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import lh.p6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m {
    public final int a;
    public final o4.v b;
    public final CopyOnWriteArrayList c;

    public m(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = vVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.n] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.a, new k(this, lVar.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.n] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.a, new k(this, lVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.a, new ah.a(this, lVar.b, i10, 15));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.a, new p6(this, lVar.b, exc, 10));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.n] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            h5.d0.K(lVar.a, new k(this, lVar.b, 0));
        }
    }
}
