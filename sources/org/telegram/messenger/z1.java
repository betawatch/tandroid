package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ z1(DownloadController downloadController, MessageObject messageObject, int i10) {
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
