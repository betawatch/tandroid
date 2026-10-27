package k2;

import m4.n1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements e2.o, e2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ g0(long j10) {
        this.a = j10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((n1) obj).g(this.a);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        y yVar;
        q0 q0Var = (q0) obj;
        u0 u0Var = q0Var.b;
        if (q0Var.equals(u0Var.j) && (yVar = u0Var.n) != null) {
            yVar.a(this.a);
        }
    }
}
