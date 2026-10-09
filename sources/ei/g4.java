package ei;

import ai.o8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ g4(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.Q();
                break;
            case 1:
                this.b.O();
                break;
            case 2:
                p4 p4Var = this.b;
                if (!p4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(p4Var.F).getInputUser(p4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(p4Var.F).getInputPeer(p4Var.w);
                    tL_messages_prolongWebView.query_id = p4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (p4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(p4Var.F).createReplyInput(p4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (p4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(p4Var.F).getInputPeer(p4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (p4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(p4Var.F).getInputPeer(p4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (p4Var.w < 0 && (chatFull = MessagesController.getInstance(p4Var.F).getChatFull(-p4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(p4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(p4Var.F).sendRequest(tL_messages_prolongWebView, new o8(p4Var, 7));
                    break;
                }
                break;
            case 3:
                p4 p4Var2 = this.b;
                p4Var2.b.b2(p4Var2, 0);
                p4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
