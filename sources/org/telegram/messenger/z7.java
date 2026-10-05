package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
