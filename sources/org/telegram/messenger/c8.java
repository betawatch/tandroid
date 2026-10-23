package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ c8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$removeRecentGif$25(this.c);
                break;
            default:
                this.b.lambda$addRecentGif$26(this.c);
                break;
        }
    }
}
