// default package

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kmf {
    public final /* synthetic */ md1 a;

    public kmf(md1 md1Var) {
        this.a = md1Var;
    }

    public final void a() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kmf) it.next()).a();
        }
    }

    public final void b(int i) {
        md1 md1Var = this.a;
        md1.g(md1Var, i);
        md1Var.d(i);
        Iterator it = new HashSet(md1Var.d).iterator();
        while (it.hasNext()) {
            ((kmf) it.next()).b(i);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kmf) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kmf) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kmf) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.a.d).iterator();
        while (it.hasNext()) {
            ((kmf) it.next()).f();
        }
    }
}
