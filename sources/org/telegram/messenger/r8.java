package org.telegram.messenger;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ r8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.a = i11;
        this.b = mediaDataController;
        this.c = z10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadRecents$49(this.c, this.d);
                break;
            case 1:
                this.b.lambda$processLoadedFeaturedStickers$62(this.c, this.d);
                break;
            default:
                this.b.lambda$loadFeaturedStickers$56(this.c, this.d);
                break;
        }
    }
}
