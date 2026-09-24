package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ z7(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
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
