package n2;

import p4.g1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements h2.o, h2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ c0(long j3) {
        this.a = j3;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((g1) obj).c(this.a);
    }

    @Override // h2.o
    public void invoke(Object obj) {
        v vVar;
        m0 m0Var = (m0) obj;
        q0 q0Var = m0Var.b;
        if (m0Var.equals(q0Var.j) && (vVar = q0Var.n) != null) {
            vVar.e(this.a);
        }
    }
}
