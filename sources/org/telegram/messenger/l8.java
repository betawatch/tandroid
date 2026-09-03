package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ l8(MediaDataController mediaDataController, String str, boolean z4, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = str;
        this.d = z4;
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
