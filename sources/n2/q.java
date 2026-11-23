package n2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb.m b;
    public final /* synthetic */ l2.e c;

    public /* synthetic */ q(jb.m mVar, l2.e eVar, int i7) {
        this.a = i7;
        this.b = mVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jb.m mVar = this.b;
                l2.e eVar = this.c;
                synchronized (eVar) {
                }
                s sVar = (s) mVar.c;
                String str = h2.l0.a;
                m2.d dVar = ((l2.a0) sVar).a.s;
                m2.a S = dVar.S((x2.g0) dVar.d.e);
                dVar.V(S, 1013, new li.c(S, eVar, 29));
                break;
            default:
                jb.m mVar2 = this.b;
                l2.e eVar2 = this.c;
                s sVar2 = (s) mVar2.c;
                String str2 = h2.l0.a;
                m2.d dVar2 = ((l2.a0) sVar2).a.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1007, new li.c(U, eVar2, 24));
                break;
        }
    }
}
