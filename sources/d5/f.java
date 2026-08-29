package d5;

import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public final boolean a;
    public final boolean b;

    public f(t0 t0Var, int i10) {
        this.a = (t0Var.d & 1) != 0;
        this.b = p.f(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return q8.t.a.c(this.b, fVar.b).c(this.a, fVar.a).e();
    }
}
