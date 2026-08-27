package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Utilities.Callback2 c;

    public /* synthetic */ x9(MessagesController messagesController, Utilities.Callback2 callback2, int i10) {
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
