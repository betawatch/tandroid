package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements org.telegram.ui.Components.di0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.messenger.fj c;

    public /* synthetic */ jf(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = fjVar;
    }

    @Override // org.telegram.ui.Components.di0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bn bnVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.e1());
                    bundle.putLong("report_reaction_from_dialog_id", bnVar.l6);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                bnVar.P7(true);
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", bnVar2.l6);
                }
                bnVar2.presentFragment(new ProfileActivity(bundle2, null));
                bnVar2.P7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        bn bnVar = this.b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, bnVar.getParentActivity(), bnVar.Ba)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.fj fjVar = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) fjVar.k.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = bnVar.getMessagesController().l1(bnVar.l6);
        tL_messages_editMessage.id = fjVar.e1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        org.telegram.messenger.g0.h3(new yf(bnVar, u1VarArr, bnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(bnVar, u1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
