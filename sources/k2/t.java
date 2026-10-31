package k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf.b b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ t(hf.b bVar, x0 x0Var, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x0 x0Var = this.c;
        hf.b bVar = this.b;
        switch (i10) {
            case 0:
                w wVar = (w) bVar.c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) wVar).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1032, new j2.e(U, x0Var, 17));
                break;
            default:
                w wVar2 = (w) bVar.c;
                String str2 = e2.l0.a;
                j2.g gVar2 = ((i2.c0) wVar2).a.s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1031, new j2.e(U2, x0Var, 0));
                break;
        }
    }
}
