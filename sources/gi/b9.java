package gi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ b9(va vaVar, Runnable runnable, int i3) {
        this.a = i3;
        this.b = vaVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.o0();
                break;
            default:
                va vaVar = this.b;
                vaVar.e(false);
                org.telegram.messenger.g0.r(vaVar.h2);
                vaVar.h2 = null;
                vaVar.T1 = false;
                this.c.run();
                break;
        }
    }
}
