package k2;

import m4.n1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements e2.o, e2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ g0(long j10) {
        this.a = j10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((n1) obj).f(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        z zVar;
        s0 s0Var = (s0) obj;
        w0 w0Var = s0Var.b;
        if (s0Var.equals(w0Var.j) && (zVar = w0Var.n) != null) {
            zVar.f(this.a);
        }
    }
}
