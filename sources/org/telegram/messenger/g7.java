package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ g7(MediaDataController mediaDataController, String str, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$fetchNewEmojiKeywords$208(this.c);
                break;
            case 1:
                this.b.lambda$fetchNewEmojiKeywords$210(this.c);
                break;
            case 2:
                this.b.lambda$fetchNewEmojiKeywords$212(this.c);
                break;
            case 3:
                this.b.lambda$fetchNewEmojiKeywords$209(this.c);
                break;
            case 4:
                this.b.lambda$fetchNewEmojiKeywords$214(this.c);
                break;
            case 5:
                this.b.lambda$putEmojiKeywords$215(this.c);
                break;
            default:
                this.b.lambda$processLoadedDiceStickers$86(this.c);
                break;
        }
    }
}
