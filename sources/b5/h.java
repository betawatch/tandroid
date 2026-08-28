package b5;

import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final boolean a;
    public final boolean b;

    public h(t0 t0Var, int i9) {
        this.a = (t0Var.d & 1) != 0;
        this.b = r.f(i9, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return o8.t.a.c(this.b, hVar.b).c(this.a, hVar.a).e();
    }
}
