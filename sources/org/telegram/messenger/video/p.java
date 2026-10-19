package org.telegram.messenger.video;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
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
