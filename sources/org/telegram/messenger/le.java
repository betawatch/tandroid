package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class le implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                MessagesController.5.lambda$getRemote$0((Utilities.Callback4) this.b, (TL_account.WebBrowserSettings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((AiTonesController) this.b).lambda$request$0((TL_aicompose.Tones) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((ChatThemeController) this.b).lambda$setDialogTheme$4((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                ((GiftAuctionController) this.b).lambda$requestUserAuctions$10((TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                ((MediaDataController) this.b).lambda$loadHints$148((TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                MessagesController.lambda$getNextReactionMentionInternal$3((q0.a) this.b, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                break;
            case 6:
                MessagesController.lambda$createCommunity$255((Utilities.Callback2) this.b, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((SendMessagesHelper) this.b).lambda$deletePollOption$27((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
