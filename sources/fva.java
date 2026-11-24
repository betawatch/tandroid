// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hva b;

    public /* synthetic */ fva(hva hvaVar, byte b) {
        this.a = b;
        this.b = hvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hva hvaVar = this.b;
        switch (b) {
            case 0:
                hvaVar.b();
                break;
            case 1:
                hvaVar.a();
                break;
            default:
                u31 u31Var = hvaVar.d;
                jva jvaVar = hvaVar.q;
                fva fvaVar = hvaVar.p;
                k47 k47Var = hvaVar.b;
                if (!hvaVar.l) {
                    hvaVar.l = true;
                    k47Var.f((int) hvaVar.k, hvaVar.c(), true);
                    long j = jvaVar.g;
                    int i = jvaVar.a;
                    jvaVar.g = j + hvaVar.k;
                    nm7.f(i).k(nm7.A3, new Object[0]);
                    hvaVar.k = 0L;
                    nm7.f(i).k(nm7.o1, Long.valueOf(k47.B0(k47Var.k)), Integer.valueOf(k47Var.e1()), k47Var.k.reactions);
                }
                if (!hvaVar.m) {
                    hvaVar.m = true;
                    hvaVar.f.b = 5000L;
                    gm.r(fvaVar);
                    gm.d3(fvaVar, 5000L);
                    u31Var.k(true);
                    u31Var.w = fvaVar;
                }
                hvaVar.e.b.setText(hvaVar.d());
                break;
        }
    }
}
