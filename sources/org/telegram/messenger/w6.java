package org.telegram.messenger;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ w6(MediaDataController mediaDataController, String str, int i10) {
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
