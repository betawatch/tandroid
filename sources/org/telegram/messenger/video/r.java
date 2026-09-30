package org.telegram.messenger.video;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.a = i10;
        this.b = videoPlayerRewinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$updateRewindSpeed$0();
                break;
            default:
                this.b.lambda$cancelRewind$1();
                break;
        }
    }
}
