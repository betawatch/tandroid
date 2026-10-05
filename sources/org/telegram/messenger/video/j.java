package org.telegram.messenger.video;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase b;

    public /* synthetic */ j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.a = i10;
        this.b = videoPlayerHolderBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$13();
                break;
            case 1:
                this.b.lambda$start$1();
                break;
            case 2:
                this.b.lambda$new$14();
                break;
            case 3:
                this.b.lambda$play$6();
                break;
            case 4:
                this.b.lambda$pause$4();
                break;
            default:
                this.b.lambda$loopBack$9();
                break;
        }
    }
}
