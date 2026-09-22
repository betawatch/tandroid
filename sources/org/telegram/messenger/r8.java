package org.telegram.messenger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
