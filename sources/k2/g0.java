package k2;

import m4.n1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
