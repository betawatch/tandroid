package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ i8(MediaDataController mediaDataController, String str, int i10) {
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
