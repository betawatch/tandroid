package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ cg(bo boVar, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = messageObject;
    }

    @Override // org.telegram.ui.Components.pj0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bo boVar = this.b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", boVar.T5);
                }
                boVar.presentFragment(new ProfileActivity(bundle, null));
                boVar.A7(true);
                break;
            default:
                bo boVar2 = this.b;
                boVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", boVar2.T5);
                }
                boVar2.presentFragment(new ProfileActivity(bundle2, null));
                boVar2.A7(true);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        bo boVar = this.b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(boVar.getParentActivity(), 3, boVar.ea)};
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
        tL_messages_editMessage.peer = boVar.getMessagesController().getInputPeer(boVar.T5);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new yg(boVar, c2VarArr, boVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ca(boVar, c2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
