package org.telegram.messenger;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavedMessagesController b;

    public /* synthetic */ wh(SavedMessagesController savedMessagesController, int i10) {
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
