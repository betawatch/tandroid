package org.telegram.messenger;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a8(MediaDataController mediaDataController, boolean z10, int i10) {
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
