package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class la implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ la(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$getSavedReactionTags$489(this.c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$deleteSavedDialog$142(this.c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.c, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.c, (ArrayList) this.e, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ la(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.a = 2;
        this.b = messagesController;
        this.d = n2Var;
        this.e = tL_channels_inviteToChannel;
        this.c = j10;
    }

    public /* synthetic */ la(TopicsController topicsController, org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList) {
        this.a = 3;
        this.b = topicsController;
        this.d = n2Var;
        this.c = j10;
        this.e = arrayList;
    }
}
