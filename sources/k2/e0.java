package k2;

import m4.m1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        o0 o0Var = (o0) obj;
        s0 s0Var = o0Var.b;
        if (o0Var.equals(s0Var.j) && (xVar = s0Var.n) != null) {
            xVar.b(this.a);
        }
    }
}
