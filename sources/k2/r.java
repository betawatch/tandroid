package k2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf.b b;
    public final /* synthetic */ i2.d c;

    public /* synthetic */ r(hf.b bVar, i2.d dVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hf.b bVar = this.b;
                i2.d dVar = this.c;
                synchronized (dVar) {
                }
                w wVar = (w) bVar.c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) wVar).a.s;
                j2.a S = gVar.S((u2.g0) gVar.d.e);
                gVar.V(S, 1013, new j2.c(S, dVar, 25));
                break;
            default:
                hf.b bVar2 = this.b;
                i2.d dVar2 = this.c;
                w wVar2 = (w) bVar2.c;
                String str2 = e2.l0.a;
                j2.g gVar2 = ((i2.c0) wVar2).a.s;
                j2.a U = gVar2.U();
                gVar2.V(U, 1007, new j2.c(U, dVar2, 20));
                break;
        }
    }
}
