package fi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ a9(va vaVar, Runnable runnable, int i7) {
        this.a = i7;
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
                org.telegram.messenger.g0.r(vaVar.g2);
                vaVar.g2 = null;
                vaVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
