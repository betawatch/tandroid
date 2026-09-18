package org.telegram.messenger;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ b8(MediaDataController mediaDataController, String str, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$fetchNewEmojiKeywords$207(this.c);
                break;
            case 1:
                this.b.lambda$putEmojiKeywords$214(this.c);
                break;
            case 2:
                this.b.lambda$fetchNewEmojiKeywords$208(this.c);
                break;
            case 3:
                this.b.lambda$fetchNewEmojiKeywords$213(this.c);
                break;
            case 4:
                this.b.lambda$processLoadedDiceStickers$86(this.c);
                break;
            case 5:
                this.b.lambda$fetchNewEmojiKeywords$209(this.c);
                break;
            default:
                this.b.lambda$fetchNewEmojiKeywords$211(this.c);
                break;
        }
    }
}
