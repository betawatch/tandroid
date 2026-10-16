package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class h4 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ BaseController c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4(GiftAuctionController giftAuctionController, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = giftAuctionController;
        this.b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((GiftAuctionController) this.c).lambda$subscribeToGiftAuctionStateInternal$0(this.b, (TL_payments.TL_StarGiftAuctionState) this.d, (ArrayList) obj);
                break;
            default:
                ((TranslateController) this.c).lambda$checkTranslation$4((MessageObject) this.d, this.b, (TLRPC.TL_textWithEntities) obj);
                break;
        }
    }

    public /* synthetic */ h4(TranslateController translateController, MessageObject messageObject, long j10) {
        this.c = translateController;
        this.d = messageObject;
        this.b = j10;
    }
}
