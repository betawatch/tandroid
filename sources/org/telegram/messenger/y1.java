package org.telegram.messenger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadController b;

    public /* synthetic */ y1(DownloadController downloadController, int i10) {
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
