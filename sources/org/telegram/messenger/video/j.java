package org.telegram.messenger.video;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
