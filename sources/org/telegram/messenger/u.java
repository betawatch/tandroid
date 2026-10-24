package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BetaUpdaterController b;

    public /* synthetic */ u(BetaUpdaterController betaUpdaterController, int i10) {
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
