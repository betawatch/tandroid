package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = downloadController;
        this.c = document;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onDownloadComplete$7(this.c, this.d);
                break;
            default:
                this.b.lambda$startDownloadFile$5(this.c, this.d);
                break;
        }
    }
}
