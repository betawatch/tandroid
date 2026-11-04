package org.telegram.messenger.video;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase b;
    public final /* synthetic */ float c;

    public /* synthetic */ l(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i3) {
        this.a = i3;
        this.b = videoPlayerHolderBase;
        this.c = f10;
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
