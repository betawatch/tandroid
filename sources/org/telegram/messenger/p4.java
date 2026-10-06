package org.telegram.messenger;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader b;
    public final /* synthetic */ String c;

    public /* synthetic */ p4(ImageLoader imageLoader, String str, int i10) {
        this.a = i10;
        this.b = imageLoader;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$artworkLoadError$10(this.c);
                break;
            case 1:
                this.b.lambda$cancelForceLoadingForImageReceiver$6(this.c);
                break;
            case 2:
                this.b.lambda$preloadArtwork$8(this.c);
                break;
            case 3:
                this.b.lambda$httpFileLoadError$9(this.c);
                break;
            default:
                this.b.lambda$fileDidFailedLoad$12(this.c);
                break;
        }
    }
}
