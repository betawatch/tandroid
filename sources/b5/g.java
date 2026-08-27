package b5;

import h3.t0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(t0 t0Var, int i10) {
        this.a = (t0Var.d & 1) != 0;
        this.b = q.f(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return p8.t.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
