package org.telegram.messenger.video;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerRewinder b;

    public /* synthetic */ r(VideoPlayerRewinder videoPlayerRewinder, int i9) {
        this.a = i9;
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
