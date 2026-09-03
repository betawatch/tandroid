package f5;

import j3.n0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
