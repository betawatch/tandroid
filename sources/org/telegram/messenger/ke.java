package org.telegram.messenger;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController.DialogPhotos b;

    public /* synthetic */ ke(MessagesController.DialogPhotos dialogPhotos, int i10) {
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
