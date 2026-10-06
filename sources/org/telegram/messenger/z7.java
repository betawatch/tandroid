package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z7(MediaDataController mediaDataController, boolean z10, int i10) {
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
