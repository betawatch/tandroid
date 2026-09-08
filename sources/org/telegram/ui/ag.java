package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements org.telegram.ui.Components.oj0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ ag(co coVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = messageObject;
    }

    @Override // org.telegram.ui.Components.oj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                co coVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", coVar.T5);
                }
                coVar.presentFragment(new ProfileActivity(bundle, null));
                coVar.A7(true);
                break;
            default:
                co coVar2 = this.b;
                coVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", coVar2.T5);
                }
                coVar2.presentFragment(new ProfileActivity(bundle2, null));
                coVar2.A7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        co coVar = this.b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(coVar.getParentActivity(), 3, coVar.ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = coVar.getMessagesController().getInputPeer(coVar.T5);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new wg(coVar, b2VarArr, coVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(coVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
