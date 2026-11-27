// default package

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
