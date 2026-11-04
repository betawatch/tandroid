package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements org.telegram.ui.Components.th0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ org.telegram.messenger.zi c;

    public /* synthetic */ ff(wm wmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = ziVar;
    }

    @Override // org.telegram.ui.Components.th0
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                wm wmVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.f1());
                    bundle.putLong("report_reaction_from_dialog_id", wmVar.k6);
                }
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                wmVar.O7(true);
                break;
            default:
                wm wmVar2 = this.b;
                wmVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.f1());
                    bundle2.putLong("report_reaction_from_dialog_id", wmVar2.k6);
                }
                wmVar2.presentFragment(new ProfileActivity(bundle2, null));
                wmVar2.O7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        wm wmVar = this.b;
        org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), wmVar.ya)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.zi ziVar = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ziVar.k.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = wmVar.getMessagesController().j1(wmVar.k6);
        tL_messages_editMessage.id = ziVar.f1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        org.telegram.messenger.g0.i3(new xf(wmVar, s1VarArr, wmVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new y9(wmVar, s1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
