package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
