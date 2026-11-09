package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements org.telegram.ui.Components.rh0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ jf(cn cnVar, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = ijVar;
    }

    @Override // org.telegram.ui.Components.rh0
    public void d(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                cn cnVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.e1());
                    bundle.putLong("report_reaction_from_dialog_id", cnVar.j6);
                }
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                cnVar.P7(true);
                break;
            default:
                cn cnVar2 = this.b;
                cnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", cnVar2.j6);
                }
                cnVar2.presentFragment(new ProfileActivity(bundle2, null));
                cnVar2.P7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn cnVar = this.b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), cnVar.za)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.ij ijVar = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ijVar.k.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = cnVar.getMessagesController().j1(cnVar.j6);
        tL_messages_editMessage.id = ijVar.e1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        org.telegram.messenger.g0.i3(new zf(cnVar, u1VarArr, cnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(cnVar, u1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
