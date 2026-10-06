package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ a2(DownloadController downloadController, MessageObject messageObject, int i10) {
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
