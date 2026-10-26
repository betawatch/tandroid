package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ k3(int i10, Runnable runnable) {
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
                this.b.run();
                break;
            case 2:
                MessagesController.lambda$unblockPeer$109(this.b);
                break;
            default:
                AndroidUtilities.runOnUIThread(this.b);
                break;
        }
    }
}
