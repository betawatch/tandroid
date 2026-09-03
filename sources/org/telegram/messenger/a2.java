package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;

    public /* synthetic */ a2(DownloadController downloadController, int i10) {
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
