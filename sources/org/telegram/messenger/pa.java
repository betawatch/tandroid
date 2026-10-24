package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pa(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
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
                ((MessagesController) this.b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.c, tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.b).lambda$pinTopic$20((org.telegram.ui.ActionBar.o2) this.d, this.c, (ArrayList) this.e, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ pa(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.a = 2;
        this.b = messagesController;
        this.d = o2Var;
        this.e = tL_channels_inviteToChannel;
        this.c = j10;
    }

    public /* synthetic */ pa(TopicsController topicsController, org.telegram.ui.ActionBar.o2 o2Var, long j10, ArrayList arrayList) {
        this.a = 3;
        this.b = topicsController;
        this.d = o2Var;
        this.c = j10;
        this.e = arrayList;
    }
}
