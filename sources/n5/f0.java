package n5;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 {
    public final /* synthetic */ c a;

    public f0(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public final void b(int i9) {
        c cVar = this.a;
        c.g(cVar, i9);
        cVar.d(i9);
        Iterator it = new HashSet(cVar.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b(i9);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((f0) it.next()).f();
        }
    }
}
