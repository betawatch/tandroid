package org.telegram.messenger;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class ql implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnconfirmedAuthController b;

    public /* synthetic */ ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
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
