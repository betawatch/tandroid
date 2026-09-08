package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController.MediaLoader b;
    public final /* synthetic */ int c;

    public /* synthetic */ r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
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
