package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ long c;

    public /* synthetic */ a7(MediaDataController mediaDataController, long j10, int i9) {
        this.a = i9;
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
