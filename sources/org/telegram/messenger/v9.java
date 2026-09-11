package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class v9 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ v9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = callback2;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.lambda$toggleChatNoForwards$278(this.c, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                this.b.lambda$fetchCommunityPendingJoinRequests$246(this.c, (TL_communities.PeerLinkRequests) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                this.b.lambda$fetchCommunityJoinedChats$247(this.c, (TL_communities.ParticipantJoinedChats) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                this.b.lambda$fetchChatsToAddToCommunity$252(this.c, (TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
