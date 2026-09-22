package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnconfirmedAuthController b;

    public /* synthetic */ rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.a = i10;
        this.b = unconfirmedAuthController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$readCache$1();
                break;
            case 1:
                this.b.lambda$saveCache$3();
                break;
            case 2:
                this.b.lambda$new$2();
                break;
            default:
                this.b.lambda$saveCache$4();
                break;
        }
    }
}
