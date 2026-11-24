// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7b b;

    public /* synthetic */ m7b(v7b v7bVar, byte b) {
        this.a = b;
        this.b = v7bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v7b v7bVar = this.b;
        switch (b) {
            case 0:
                a8b a8bVar = v7bVar.a0;
                u31.h(a8bVar.c);
                super/*my0*/.dismiss();
                break;
            case 1:
                v7bVar.w.setLoading(false);
                a8b a8bVar2 = v7bVar.a0;
                a8bVar2.F0();
                a8bVar2.l1.E(0);
                break;
            case 2:
                v7bVar.V = false;
                break;
            case 3:
                a8b a8bVar3 = v7bVar.a0;
                a8bVar3.G1 = 6;
                a8bVar3.l1.E(1);
                break;
            case 4:
                v7bVar.n.g(2);
                v7bVar.f.forceLayout();
                v7bVar.k();
                break;
            default:
                int i = v7bVar.a;
                a8b a8bVar4 = v7bVar.a0;
                if (i != 0) {
                    a8bVar4.onBackPressed();
                    break;
                } else {
                    a8bVar4.dismiss();
                    break;
                }
        }
    }
}
