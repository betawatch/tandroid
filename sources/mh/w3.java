package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ w3(g4 g4Var, int i9) {
        this.a = i9;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.L();
                break;
            case 1:
                this.b.K();
                break;
            case 2:
                g4 g4Var = this.b;
                if (!g4Var.P) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(g4Var.B).getInputUser(g4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(g4Var.B).getInputPeer(g4Var.w);
                    tL_messages_prolongWebView.query_id = g4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (g4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(g4Var.B).createReplyInput(g4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (g4Var.A != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(g4Var.B).getInputPeer(g4Var.A);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (g4Var.A != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(g4Var.B).getInputPeer(g4Var.A);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (g4Var.w < 0 && (chatFull = MessagesController.getInstance(g4Var.B).getChatFull(-g4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(g4Var.B).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(g4Var.B).sendRequest(tL_messages_prolongWebView, new bf.a(g4Var, 18));
                    break;
                }
                break;
            case 3:
                g4 g4Var2 = this.b;
                g4Var2.b.X1(g4Var2, 0);
                g4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
