package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;

    public /* synthetic */ v6(MediaDataController mediaDataController, long j3, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadPinnedMessages$161(this.c);
                break;
            case 1:
                this.b.lambda$increasePeerRaiting$157(this.c);
                break;
            default:
                this.b.lambda$clearBotKeyboard$195(this.c);
                break;
        }
    }
}
