package org.telegram.messenger;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController.DialogPhotos b;

    public /* synthetic */ ne(MessagesController.DialogPhotos dialogPhotos, int i10) {
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
