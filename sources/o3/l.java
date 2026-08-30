package o3;

import h5.d0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import lh.p6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
            d0.K(kVar.a, new ah.a(this, kVar.b, i10, 15));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            d0.K(kVar.a, new p6(this, kVar.b, exc, 10));
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
