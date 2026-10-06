package ei;

import ai.n8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;

    public /* synthetic */ h4(r4 r4Var, int i10) {
        this.a = i10;
        this.b = r4Var;
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
                this.b.J();
                break;
            case 2:
                r4 r4Var = this.b;
                if (!r4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(r4Var.F).getInputUser(r4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(r4Var.F).getInputPeer(r4Var.w);
                    tL_messages_prolongWebView.query_id = r4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (r4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(r4Var.F).createReplyInput(r4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (r4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(r4Var.F).getInputPeer(r4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (r4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(r4Var.F).getInputPeer(r4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (r4Var.w < 0 && (chatFull = MessagesController.getInstance(r4Var.F).getChatFull(-r4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(r4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(r4Var.F).sendRequest(tL_messages_prolongWebView, new n8(r4Var, 7));
                    break;
                }
                break;
            case 3:
                r4 r4Var2 = this.b;
                r4Var2.b.W1(r4Var2, 0);
                r4Var2.n.o(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.o(true, false);
                break;
        }
    }
}
