package org.telegram.messenger;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavedMessagesController b;

    public /* synthetic */ xh(SavedMessagesController savedMessagesController, int i10) {
        this.a = i10;
        this.b = savedMessagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.update();
                break;
            case 1:
                this.b.saveCache();
                break;
            case 2:
                this.b.lambda$deleteCache$12();
                break;
            case 3:
                this.b.lambda$saveCache$10();
                break;
            default:
                this.b.lambda$loadDialogs$1();
                break;
        }
    }
}
