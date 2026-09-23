package org.telegram.messenger.video;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
