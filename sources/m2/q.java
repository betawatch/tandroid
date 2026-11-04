package m2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ k2.d c;

    public /* synthetic */ q(t tVar, k2.d dVar, int i3) {
        this.a = i3;
        this.b = tVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                k2.d dVar = this.c;
                synchronized (dVar) {
                }
                u uVar = (u) tVar.c;
                String str = g2.n0.a;
                l2.f fVar = ((k2.c0) uVar).a.s;
                l2.a S = fVar.S((w2.g0) fVar.d.e);
                fVar.V(S, 1013, new l2.c(S, dVar, 15));
                break;
            default:
                t tVar2 = this.b;
                k2.d dVar2 = this.c;
                u uVar2 = (u) tVar2.c;
                String str2 = g2.n0.a;
                l2.f fVar2 = ((k2.c0) uVar2).a.s;
                l2.a U = fVar2.U();
                fVar2.V(U, 1007, new l2.c(U, dVar2, 10));
                break;
        }
    }
}
