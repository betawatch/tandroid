package n2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb.m b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ r(jb.m mVar, t0 t0Var, int i7) {
        this.a = i7;
        this.b = mVar;
        this.c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        t0 t0Var = this.c;
        jb.m mVar = this.b;
        switch (i7) {
            case 0:
                s sVar = (s) mVar.c;
                String str = h2.l0.a;
                m2.d dVar = ((l2.a0) sVar).a.s;
                m2.a U = dVar.U();
                dVar.V(U, 1032, new m2.c(U, t0Var, 21));
                break;
            default:
                s sVar2 = (s) mVar.c;
                String str2 = h2.l0.a;
                m2.d dVar2 = ((l2.a0) sVar2).a.s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1031, new m2.c(U2, t0Var, 4));
                break;
        }
    }
}
