package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ j3(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLog.lambda$postProtocolDump$0(this.b);
                break;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.b);
                break;
            case 2:
                this.b.run();
                break;
            default:
                AndroidUtilities.runOnUIThread(this.b);
                break;
        }
    }
}
