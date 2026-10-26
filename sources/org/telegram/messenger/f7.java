package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ f7(MediaDataController mediaDataController, String str, int i10) {
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
