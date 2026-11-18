package n2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                m2.d dVar2 = ((l2.z) sVar).a.s;
                m2.a S = dVar2.S((x2.g0) dVar2.d.e);
                dVar2.V(S, 1013, new li.c(S, dVar, 29));
                break;
            default:
                k8.a aVar2 = this.b;
                l2.d dVar3 = this.c;
                s sVar2 = (s) aVar2.c;
                String str2 = h2.l0.a;
                m2.d dVar4 = ((l2.z) sVar2).a.s;
                m2.a U = dVar4.U();
                dVar4.V(U, 1007, new li.c(U, dVar3, 24));
                break;
        }
    }
}
