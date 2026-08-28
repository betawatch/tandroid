package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnconfirmedAuthController b;

    public /* synthetic */ hl(UnconfirmedAuthController unconfirmedAuthController, int i9) {
        this.a = i9;
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
