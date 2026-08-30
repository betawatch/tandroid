package l3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7.b b;
    public final /* synthetic */ n3.f c;

    public /* synthetic */ p(f7.b bVar, n3.f fVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f7.b bVar = this.b;
                n3.f fVar = this.c;
                q qVar = (q) bVar.c;
                int i10 = h5.d0.a;
                k3.f fVar2 = ((j3.c0) qVar).a.q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1007, new k3.c(p10, fVar, 20));
                break;
            default:
                f7.b bVar2 = this.b;
                n3.f fVar3 = this.c;
                synchronized (fVar3) {
                }
                q qVar2 = (q) bVar2.c;
                int i11 = h5.d0.a;
                k3.f fVar4 = ((j3.c0) qVar2).a.q;
                k3.a n10 = fVar4.n((o4.v) fVar4.d.e);
                fVar4.q(n10, 1013, new k3.c(n10, fVar3, 6));
                break;
        }
    }
}
