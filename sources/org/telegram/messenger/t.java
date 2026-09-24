package org.telegram.messenger;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
