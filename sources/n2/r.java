package n2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8.a b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ r(k8.a aVar, s0 s0Var, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        s0 s0Var = this.c;
        k8.a aVar = this.b;
        switch (i7) {
            case 0:
                s sVar = (s) aVar.c;
                String str = h2.l0.a;
                m2.e eVar = ((l2.z) sVar).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1032, new m2.c(U, s0Var, 20));
                break;
            default:
                s sVar2 = (s) aVar.c;
                String str2 = h2.l0.a;
                m2.e eVar2 = ((l2.z) sVar2).a.s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1031, new m2.c(U2, s0Var, 3));
                break;
        }
    }
}
