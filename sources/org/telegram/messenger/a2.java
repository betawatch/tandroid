package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ MessageObject d;

    public /* synthetic */ a2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
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
