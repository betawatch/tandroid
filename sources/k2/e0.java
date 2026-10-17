package k2;

import m4.m1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements e2.o, e2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ e0(long j10) {
        this.a = j10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m1) obj).g(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        x xVar;
        p0 p0Var = (p0) obj;
        t0 t0Var = p0Var.b;
        if (p0Var.equals(t0Var.j) && (xVar = t0Var.n) != null) {
            xVar.e(this.a);
        }
    }
}
