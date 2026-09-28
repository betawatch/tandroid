package org.telegram.messenger;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class yh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavedMessagesController b;

    public /* synthetic */ yh(SavedMessagesController savedMessagesController, int i10) {
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
