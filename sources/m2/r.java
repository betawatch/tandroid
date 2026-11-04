package m2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ t0 c;

    public /* synthetic */ r(t tVar, t0 t0Var, int i3) {
        this.a = i3;
        this.b = tVar;
        this.c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        t0 t0Var = this.c;
        t tVar = this.b;
        switch (i3) {
            case 0:
                u uVar = (u) tVar.c;
                String str = g2.n0.a;
                l2.f fVar = ((k2.c0) uVar).a.s;
                l2.a U = fVar.U();
                fVar.V(U, 1032, new l2.d(U, t0Var, 7));
                break;
            default:
                u uVar2 = (u) tVar.c;
                String str2 = g2.n0.a;
                l2.f fVar2 = ((k2.c0) uVar2).a.s;
                l2.a U2 = fVar2.U();
                fVar2.V(U2, 1031, new l2.c(U2, t0Var, 20));
                break;
        }
    }
}
