package k2;

import m4.n1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements e2.o, e2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ e0(long j10) {
        this.a = j10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((n1) obj).g(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        x xVar;
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.b;
        if (o0Var.equals(s0Var.j) && (xVar = s0Var.n) != null) {
            xVar.b(this.a);
        }
    }
}
