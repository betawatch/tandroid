package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
