package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
