package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController.MediaLoader b;
    public final /* synthetic */ int c;

    public /* synthetic */ q6(MediaController.MediaLoader mediaLoader, int i9, int i10) {
        this.a = i10;
        this.b = mediaLoader;
        this.c = i9;
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
