package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class pl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnconfirmedAuthController b;

    public /* synthetic */ pl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
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
