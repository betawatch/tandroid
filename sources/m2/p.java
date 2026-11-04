package m2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ p(t tVar, Exception exc, int i3) {
        this.a = i3;
        this.b = tVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Exception exc = this.c;
        t tVar = this.b;
        switch (i3) {
            case 0:
                u uVar = (u) tVar.c;
                String str = g2.n0.a;
                l2.f fVar = ((k2.c0) uVar).a.s;
                l2.a U = fVar.U();
                fVar.V(U, 1029, new l2.c(U, exc, 5));
                break;
            default:
                u uVar2 = (u) tVar.c;
                String str2 = g2.n0.a;
                l2.f fVar2 = ((k2.c0) uVar2).a.s;
                l2.a U2 = fVar2.U();
                fVar2.V(U2, 1014, new l2.c(U2, exc, 27));
                break;
        }
    }
}
