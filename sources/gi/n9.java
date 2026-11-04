package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ n9(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                va vaVar = this.b;
                vaVar.getClass();
                vaVar.f(1.0f, true, new v8(vaVar, 6));
                vaVar.c1.b(true, true);
                break;
            default:
                va vaVar2 = this.b;
                vaVar2.e(false);
                vaVar2.n2 = null;
                break;
        }
    }
}
