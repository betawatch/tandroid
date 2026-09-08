package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
