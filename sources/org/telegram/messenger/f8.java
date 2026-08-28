package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f8(MediaDataController mediaDataController, String str, boolean z10, int i9) {
        this.a = i9;
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
