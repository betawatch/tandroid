package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ y7(MediaDataController mediaDataController, String str, int i9) {
        this.a = i9;
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
