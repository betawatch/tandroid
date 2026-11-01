package ag;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                w.d0(this.b);
                break;
            case 1:
                w.e0(this.b);
                break;
            default:
                n nVar = this.b.e;
                org.telegram.messenger.i0.r(nVar);
                org.telegram.messenger.i0.h3(nVar, 5000L);
                break;
        }
    }
}
