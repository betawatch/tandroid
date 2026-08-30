package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f8(MediaDataController mediaDataController, boolean z4, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = z4;
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
