package ag;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ n(w wVar, int i10) {
        this.a = i10;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w.c0(this.b);
                break;
            case 1:
                w.d0(this.b);
                break;
            default:
                n nVar = this.b.e;
                org.telegram.messenger.i0.r(nVar);
                org.telegram.messenger.i0.h3(nVar, 5000L);
                break;
        }
    }
}
