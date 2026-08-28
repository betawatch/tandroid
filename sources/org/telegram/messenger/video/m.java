package org.telegram.messenger.video;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase b;
    public final /* synthetic */ float c;

    public /* synthetic */ m(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i9) {
        this.a = i9;
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
