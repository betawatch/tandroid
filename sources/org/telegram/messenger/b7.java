package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController.MediaLoader b;
    public final /* synthetic */ int c;

    public /* synthetic */ b7(MediaController.MediaLoader mediaLoader, int i10, int i11) {
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
