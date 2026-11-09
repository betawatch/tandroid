package n2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2.n b;
    public final /* synthetic */ l2.d c;

    public /* synthetic */ q(j2.n nVar, l2.d dVar, int i7) {
        this.a = i7;
        this.b = nVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.n nVar = this.b;
                l2.d dVar = this.c;
                synchronized (dVar) {
                }
                s sVar = (s) nVar.c;
                String str = h2.m0.a;
                m2.e eVar = ((l2.c0) sVar).a.s;
                m2.a S = eVar.S((x2.g0) eVar.d.e);
                eVar.V(S, 1013, new m2.c(S, dVar, 22));
                break;
            default:
                j2.n nVar2 = this.b;
                l2.d dVar2 = this.c;
                s sVar2 = (s) nVar2.c;
                String str2 = h2.m0.a;
                m2.e eVar2 = ((l2.c0) sVar2).a.s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1007, new m2.c(U, dVar2, 17));
                break;
        }
    }
}
