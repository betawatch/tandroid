package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ w3(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
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
                f4 f4Var = this.b;
                if (!f4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(f4Var.F).getInputUser(f4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(f4Var.F).getInputPeer(f4Var.w);
                    tL_messages_prolongWebView.query_id = f4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (f4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(f4Var.F).createReplyInput(f4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (f4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(f4Var.F).getInputPeer(f4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (f4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(f4Var.F).getInputPeer(f4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (f4Var.w < 0 && (chatFull = MessagesController.getInstance(f4Var.F).getChatFull(-f4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(f4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(f4Var.F).sendRequest(tL_messages_prolongWebView, new ai.h(f4Var, 13));
                    break;
                }
                break;
            case 3:
                f4 f4Var2 = this.b;
                f4Var2.b.b2(f4Var2, 0);
                f4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
