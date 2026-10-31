package k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf.b b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ q(hf.b bVar, Exception exc, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        hf.b bVar = this.b;
        switch (i10) {
            case 0:
                w wVar = (w) bVar.c;
                String str = e2.l0.a;
                j2.g gVar = ((i2.c0) wVar).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1029, new j2.c(U, exc, 15));
                break;
            default:
                w wVar2 = (w) bVar.c;
                String str2 = e2.l0.a;
                j2.g gVar2 = ((i2.c0) wVar2).a.s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1014, new j2.e(U2, exc, 7));
                break;
        }
    }
}
