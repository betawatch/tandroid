package n2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8.a b;
    public final /* synthetic */ l2.d c;

    public /* synthetic */ q(k8.a aVar, l2.d dVar, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8.a aVar = this.b;
                l2.d dVar = this.c;
                synchronized (dVar) {
                }
                s sVar = (s) aVar.c;
                String str = h2.l0.a;
                m2.e eVar = ((l2.z) sVar).a.s;
                m2.a S = eVar.S((x2.f0) eVar.d.e);
                eVar.V(S, 1013, new li.p(S, dVar, 28));
                break;
            default:
                k8.a aVar2 = this.b;
                l2.d dVar2 = this.c;
                s sVar2 = (s) aVar2.c;
                String str2 = h2.l0.a;
                m2.e eVar2 = ((l2.z) sVar2).a.s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1007, new li.p(U, dVar2, 23));
                break;
        }
    }
}
