package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ b2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = downloadController;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startDownloadFile$4(this.c);
                break;
            case 1:
                this.b.lambda$onDownloadFail$9(this.c);
                break;
            default:
                this.b.lambda$onDownloadComplete$6(this.c);
                break;
        }
    }
}
