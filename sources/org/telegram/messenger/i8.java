package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
