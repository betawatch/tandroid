package org.telegram.messenger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class ul implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoEncodingService b;

    public /* synthetic */ ul(VideoEncodingService videoEncodingService, int i10) {
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
