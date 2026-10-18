package org.telegram.messenger;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;

    public /* synthetic */ b2(DownloadController downloadController, int i10) {
        this.a = i10;
        this.b = downloadController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$clearRecentDownloadedFiles$12();
                break;
            case 1:
                this.b.lambda$new$0();
                break;
            default:
                this.b.lambda$loadDownloadingFiles$11();
                break;
        }
    }
}
