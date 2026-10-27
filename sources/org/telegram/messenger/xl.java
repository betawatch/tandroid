package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class xl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ xl(VideoEncodingService videoEncodingService, int i10) {
        this.a = i10;
        this.b = videoEncodingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$didReceivedNotification$0();
                break;
            default:
                this.b.updateNotification();
                break;
        }
    }
}
