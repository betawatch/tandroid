package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageLoader b;
    public final /* synthetic */ String c;

    public /* synthetic */ o4(ImageLoader imageLoader, String str, int i10) {
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
