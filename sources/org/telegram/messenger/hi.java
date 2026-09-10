package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class hi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavedMessagesController b;

    public /* synthetic */ hi(SavedMessagesController savedMessagesController, int i10) {
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
