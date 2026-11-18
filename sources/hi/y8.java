package hi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ y8(ta taVar, Runnable runnable, int i7) {
        this.a = i7;
        this.b = taVar;
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
                ta taVar = this.b;
                taVar.e(false);
                org.telegram.messenger.g0.r(taVar.h2);
                taVar.h2 = null;
                taVar.T1 = false;
                this.c.run();
                break;
        }
    }
}
