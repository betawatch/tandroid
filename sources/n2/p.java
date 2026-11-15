package n2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8.a b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ p(k8.a aVar, Exception exc, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Exception exc = this.c;
        k8.a aVar = this.b;
        switch (i7) {
            case 0:
                s sVar = (s) aVar.c;
                String str = h2.l0.a;
                m2.e eVar = ((l2.z) sVar).a.s;
                m2.a U = eVar.U();
                eVar.V(U, 1029, new li.p(U, exc, 18));
                break;
            default:
                s sVar2 = (s) aVar.c;
                String str2 = h2.l0.a;
                m2.e eVar2 = ((l2.z) sVar2).a.s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1014, new m2.c(U2, exc, 10));
                break;
        }
    }
}
