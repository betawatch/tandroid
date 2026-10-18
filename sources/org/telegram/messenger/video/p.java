package org.telegram.messenger.video;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
