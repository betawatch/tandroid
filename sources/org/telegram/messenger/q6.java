package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController.MediaLoader b;
    public final /* synthetic */ int c;

    public /* synthetic */ q6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.a = i11;
        this.b = mediaLoader;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$didReceivedNotification$11(this.c);
                break;
            case 1:
                this.b.lambda$copyFile$9(this.c);
                break;
            case 2:
                this.b.lambda$copyFile$10(this.c);
                break;
            default:
                this.b.lambda$processLivePhotoMessage$6(this.c);
                break;
        }
    }
}
