package org.telegram.messenger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;

    public /* synthetic */ c7(MediaDataController mediaDataController, long j3, int i10) {
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
                this.b.lambda$clearBotKeyboard$194(this.c);
                break;
        }
    }
}
