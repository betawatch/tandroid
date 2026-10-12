package org.telegram.messenger;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processLoadedDiceStickers$87(this.c, this.d);
                break;
            default:
                this.b.lambda$loadStickersByEmojiOrName$83(this.c, this.d);
                break;
        }
    }
}
