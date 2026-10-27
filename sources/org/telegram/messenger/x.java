package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BetaUpdaterController b;

    public /* synthetic */ x(BetaUpdaterController betaUpdaterController, int i10) {
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
