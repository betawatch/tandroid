package n2;

import p4.g1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements h2.o, h2.j {
    public final /* synthetic */ long a;

    public /* synthetic */ d0(long j3) {
        this.a = j3;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((g1) obj).c(this.a);
    }

    @Override // h2.o
    public void invoke(Object obj) {
        v vVar;
        n0 n0Var = (n0) obj;
        r0 r0Var = n0Var.b;
        if (n0Var.equals(r0Var.j) && (vVar = r0Var.n) != null) {
            vVar.b(this.a);
        }
    }
}
