package fi;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
