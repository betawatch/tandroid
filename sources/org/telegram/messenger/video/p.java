package org.telegram.messenger.video;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.a = i7;
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
