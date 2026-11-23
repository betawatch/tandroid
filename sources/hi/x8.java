package hi;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ x8(sa saVar, Runnable runnable, int i7) {
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
