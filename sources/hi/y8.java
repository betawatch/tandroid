package hi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
