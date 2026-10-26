package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((AgentController) this.b).lambda$connect$2((Utilities.Callback) this.c, (TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((ChatThemeController) this.b).lambda$requestNextChatThemes$21((ResultCallback) this.c, (TL_account.ChatThemes) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((GiftAuctionController) this.b).lambda$requestGiftAuctionInternal$4((Utilities.Callback2) this.c, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                ((MessagesController) this.b).lambda$fetchJoinedCommunities$250((Utilities.Callback) this.c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                break;
            case 4:
                PasskeysController.lambda$create$4((org.telegram.ui.ActionBar.e2) this.b, (Utilities.Callback2) this.c, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((UnconfirmedAuthController.UnconfirmedAuth) this.b).lambda$confirm$0((Utilities.Callback) this.c, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
