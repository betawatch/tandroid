package org.telegram.messenger;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class oe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController.DialogPhotos b;

    public /* synthetic */ oe(MessagesController.DialogPhotos dialogPhotos, int i10) {
        this.a = i10;
        this.b = dialogPhotos;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadCache$5();
                break;
            default:
                this.b.lambda$saveCache$6();
                break;
        }
    }
}
