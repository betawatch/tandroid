package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ sa(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.b);
                break;
            case 1:
                this.b.run();
                break;
            default:
                AndroidUtilities.runOnUIThread(this.b);
                break;
        }
    }
}
