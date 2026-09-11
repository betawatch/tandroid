package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ a8(MediaDataController mediaDataController, String str, int i10) {
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
