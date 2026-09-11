package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class oh implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oh(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.1.lambda$onResult$0((org.telegram.ui.ActionBar.b2) this.c, (Utilities.Callback3) this.d, this.b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((BotForumHelper) this.c).lambda$performSendBotTopicCreate$5(this.b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((GiftAuctionController) this.c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ oh(BotForumHelper botForumHelper, long j3, String str) {
        this.a = 1;
        this.c = botForumHelper;
        this.b = j3;
        this.d = str;
    }
}
