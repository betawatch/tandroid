package o3;

import h5.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import mh.p6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class l {
    public final int a;
    public final o4.v b;
    public final CopyOnWriteArrayList c;

    public l(CopyOnWriteArrayList copyOnWriteArrayList, int i10, o4.v vVar) {
        this.c = copyOnWriteArrayList;
        this.a = i10;
        this.b = vVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.m] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.a, new j(this, kVar.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.m] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.a, new j(this, kVar.b, 1));
        }
    }

    public final void c(int i10) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.a, new bh.a(this, kVar.b, i10, 12));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.a, new p6(this, kVar.b, exc, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o3.m] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.a, new j(this, kVar.b, 0));
        }
    }
}
