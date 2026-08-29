package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;

    public /* synthetic */ e7(MediaDataController mediaDataController, long j10, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = j10;
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
