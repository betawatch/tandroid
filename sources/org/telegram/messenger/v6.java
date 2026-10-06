package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
