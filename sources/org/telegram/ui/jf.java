package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements org.telegram.ui.Components.qh0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.messenger.ij c;

    public /* synthetic */ jf(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = ijVar;
    }

    @Override // org.telegram.ui.Components.qh0
    public void b(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                an anVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.f1());
                    bundle.putLong("report_reaction_from_dialog_id", anVar.j6);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                anVar.O7(true);
                break;
            default:
                an anVar2 = this.b;
                anVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.f1());
                    bundle2.putLong("report_reaction_from_dialog_id", anVar2.j6);
                }
                anVar2.presentFragment(new ProfileActivity(bundle2, null));
                anVar2.O7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        an anVar = this.b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), anVar.xa)};
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
        tL_messages_editMessage.peer = anVar.getMessagesController().j1(anVar.j6);
        tL_messages_editMessage.id = ijVar.f1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        org.telegram.messenger.g0.i3(new bg(anVar, u1VarArr, anVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(anVar, u1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
