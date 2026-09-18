package ei;

import ai.m8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ g4(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.R();
                break;
            case 1:
                this.b.L();
                break;
            case 2:
                q4 q4Var = this.b;
                if (!q4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(q4Var.F).getInputUser(q4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.w);
                    tL_messages_prolongWebView.query_id = q4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (q4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(q4Var.F).createReplyInput(q4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (q4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (q4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (q4Var.w < 0 && (chatFull = MessagesController.getInstance(q4Var.F).getChatFull(-q4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(q4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(q4Var.F).sendRequest(tL_messages_prolongWebView, new m8(q4Var, 7));
                    break;
                }
                break;
            case 3:
                q4 q4Var2 = this.b;
                q4Var2.b.X1(q4Var2, 0);
                q4Var2.n.o(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.o(true, false);
                break;
        }
    }
}
