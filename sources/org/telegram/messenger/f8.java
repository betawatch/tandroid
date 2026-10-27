package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ f8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
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
