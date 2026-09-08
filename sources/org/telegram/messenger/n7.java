package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class n7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;

    public /* synthetic */ n7(MediaDataController mediaDataController, int i10) {
        this.a = i10;
        this.b = mediaDataController;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$checkGenericAnimations$80(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$clearRecentStickers$19(tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$preloadPremiumPreviewStickers$206(tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$loadPremiumPromo$8(tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$loadReactions$14(tLObject, tL_error);
                break;
            case 5:
                this.b.lambda$checkPremiumGiftStickers$76(tLObject, tL_error);
                break;
            case 6:
                this.b.lambda$loadDraftsIfNeed$187(tLObject, tL_error);
                break;
            case 7:
                this.b.lambda$checkDefaultTopicIcons$82(tLObject, tL_error);
                break;
            case 8:
                this.b.lambda$loadGroupStickerSet$46(tLObject, tL_error);
                break;
            default:
                this.b.lambda$checkTonGiftStickers$78(tLObject, tL_error);
                break;
        }
    }
}
