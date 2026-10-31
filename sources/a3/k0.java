package a3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf.b b;
    public final /* synthetic */ i2.d c;

    public /* synthetic */ k0(hf.b bVar, i2.d dVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 4;
        switch (this.a) {
            case 0:
                hf.b bVar = this.b;
                i2.d dVar = this.c;
                m0 m0Var = (m0) bVar.c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) m0Var).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1015, new j2.e(U, dVar, 4));
                break;
            default:
                hf.b bVar2 = this.b;
                i2.d dVar2 = this.c;
                synchronized (dVar2) {
                }
                m0 m0Var2 = (m0) bVar2.c;
                String str2 = e2.l0.a;
                i2.i0 i0Var = ((i2.c0) m0Var2).a;
                j2.g gVar2 = i0Var.s;
                j2.a S = gVar2.S((u2.g0) gVar2.d.e);
                gVar2.V(S, 1020, new ig.c0(S, dVar2, i10));
                i0Var.S = null;
                break;
        }
    }
}
