package org.telegram.messenger.video;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase b;
    public final /* synthetic */ float c;

    public /* synthetic */ l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.a = i10;
        this.b = videoPlayerHolderBase;
        this.c = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setSpeed$5(this.c);
                break;
            case 1:
                this.b.lambda$play$7(this.c);
                break;
            default:
                this.b.lambda$setVolume$10(this.c);
                break;
        }
    }
}
