package org.telegram.messenger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BetaUpdaterController b;

    public /* synthetic */ t(BetaUpdaterController betaUpdaterController, int i10) {
        this.a = i10;
        this.b = betaUpdaterController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$downloadUpdate$3();
                break;
            default:
                this.b.lambda$new$0();
                break;
        }
    }
}
