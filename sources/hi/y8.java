package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ y8(sa saVar, Runnable runnable, int i7) {
        this.a = i7;
        this.b = saVar;
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
                sa saVar = this.b;
                saVar.e(false);
                org.telegram.messenger.g0.r(saVar.h2);
                saVar.h2 = null;
                saVar.T1 = false;
                this.c.run();
                break;
        }
    }
}
