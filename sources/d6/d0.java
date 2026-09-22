package d6;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ c a;

    public d0(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a();
        }
    }

    public final void b(int i10) {
        c cVar = this.a;
        c.g(cVar, i10);
        cVar.d(i10);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).b(i10);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f();
        }
    }
}
