// default package

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn1 implements b29, ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ k47 c;

    public /* synthetic */ nn1(yv1 yv1Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = k47Var;
    }

    @Override // b29
    public final void i(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        k47 k47Var = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", k47Var.e1());
                    bundle.putLong("report_reaction_from_dialog_id", yv1Var.l6);
                }
                yv1Var.presentFragment(new ProfileActivity(bundle, null));
                yv1Var.N5(true);
                break;
            default:
                yv1Var.getClass();
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", k47Var.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", yv1Var.l6);
                }
                yv1Var.presentFragment(new ProfileActivity(bundle2, null));
                yv1Var.N5(true);
                break;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        yv1 yv1Var = this.b;
        he[] heVarArr = {new he(3, yv1Var.Ba, yv1Var.getParentActivity())};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        k47 k47Var = this.c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k47Var.k.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = yv1Var.getMessagesController().i1(yv1Var.l6);
        tL_messages_editMessage.id = k47Var.e1();
        tL_messages_editMessage.flags |= TLObject.FLAG_14;
        gm.d3(new lo1(yv1Var, heVarArr, yv1Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new eo0((Object) yv1Var, (Object) heVarArr, (Object) tL_messages_editMessage, (byte) 17)), (byte) 2), 500L);
    }
}
