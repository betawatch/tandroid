package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
