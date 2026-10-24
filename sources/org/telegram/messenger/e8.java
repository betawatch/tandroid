package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadFeaturedStickers$55(this.c);
                break;
            default:
                this.b.lambda$processLoadedFeaturedStickers$59(this.c);
                break;
        }
    }
}
