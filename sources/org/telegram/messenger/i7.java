package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;

    public /* synthetic */ i7(MediaDataController mediaDataController, int i10) {
        this.a = i10;
        this.b = mediaDataController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$fetchEmojiStatuses$232();
                break;
            case 1:
                this.b.lambda$processLoadedMenuBots$5();
                break;
            case 2:
                this.b.lambda$addRecentSticker$20();
                break;
            case 3:
                this.b.lambda$processLoadedReactions$15();
                break;
            case 4:
                this.b.lambda$clearRecentEmojiStatuses$229();
                break;
            case 5:
                this.b.lambda$clearRecentStickers$17();
                break;
            case 6:
                this.b.lambda$loadPremiumPromo$7();
                break;
            case 7:
                this.b.lambda$processLoadedPremiumPromo$9();
                break;
            case 8:
                this.b.lambda$cleanupStickerSetCache$39();
                break;
            case 9:
                this.b.lambda$cleanup$2();
                break;
            case 10:
                this.b.lambda$loadReactions$12();
                break;
            case 11:
                this.b.lambda$fetchEmojiStatuses$230();
                break;
            case 12:
                this.b.lambda$loadHints$145();
                break;
            case 13:
                this.b.lambda$loadAttachMenuBots$3();
                break;
            case 14:
                this.b.lambda$loadHints$146();
                break;
            case 15:
                this.b.lambda$clearTopPeers$149();
                break;
            case 16:
                this.b.lambda$loadDraftsIfNeed$185();
                break;
            case 17:
                this.b.lambda$loadDraftsIfNeed$186();
                break;
            default:
                this.b.lambda$fetchNewEmojiKeywords$210();
                break;
        }
    }
}
