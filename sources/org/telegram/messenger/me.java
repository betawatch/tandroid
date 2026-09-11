package org.telegram.messenger;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController.DialogPhotos b;

    public /* synthetic */ me(MessagesController.DialogPhotos dialogPhotos, int i10) {
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
