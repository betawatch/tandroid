package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements org.telegram.ui.Components.fi0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public /* synthetic */ jf(bn bnVar, org.telegram.messenger.gj gjVar, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = gjVar;
    }

    @Override // org.telegram.ui.Components.fi0
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

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        bn bnVar = this.b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), bnVar.Ba)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.gj gjVar = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) gjVar.k.media;
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
        tL_messages_editMessage.id = gjVar.e1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        org.telegram.messenger.g0.h3(new yf(bnVar, t1VarArr, bnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(bnVar, t1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
