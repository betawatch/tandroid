package org.telegram.messenger;

import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class rh implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rh(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.1.lambda$onResult$0((org.telegram.ui.ActionBar.d2) this.c, (Utilities.Callback3) this.d, this.b, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((BotForumHelper) this.c).lambda$performSendBotTopicCreate$5(this.b, (String) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((GiftAuctionController) this.c).lambda$getOrRequestAuction$12((Utilities.Callback2) this.d, this.b, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ rh(BotForumHelper botForumHelper, long j10, String str) {
        this.a = 1;
        this.c = botForumHelper;
        this.b = j10;
        this.d = str;
    }
}
