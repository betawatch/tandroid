package hi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
