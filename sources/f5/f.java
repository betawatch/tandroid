package f5;

import j3.n0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class f implements Comparable {
    public final boolean a;
    public final boolean b;

    public f(n0 n0Var, int i10) {
        this.a = (n0Var.d & 1) != 0;
        this.b = p.f(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return s8.p.a.c(this.b, fVar.b).c(this.a, fVar.a).e();
    }
}
