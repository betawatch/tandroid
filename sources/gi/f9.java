package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f9(va vaVar, boolean z10, int i3) {
        this.a = i3;
        this.b = vaVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                va vaVar = this.b;
                if (!this.c) {
                    vaVar.K0.b(false, false);
                    break;
                } else {
                    vaVar.getClass();
                    break;
                }
            default:
                va vaVar2 = this.b;
                vaVar2.S = null;
                vaVar2.e = false;
                vaVar2.p(this.c);
                break;
        }
    }
}
