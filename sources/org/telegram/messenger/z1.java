package org.telegram.messenger;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
