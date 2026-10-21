package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ a8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
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
