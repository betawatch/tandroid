package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ BaseController c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d4(GiftAuctionController giftAuctionController, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = giftAuctionController;
        this.b = j3;
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

    public /* synthetic */ d4(TranslateController translateController, MessageObject messageObject, long j3) {
        this.c = translateController;
        this.d = messageObject;
        this.b = j3;
    }
}
