package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4 b;

    public /* synthetic */ f4(o4 o4Var, int i10) {
        this.a = i10;
        this.b = o4Var;
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
                o4 o4Var = this.b;
                if (!o4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(o4Var.F).getInputUser(o4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(o4Var.F).getInputPeer(o4Var.w);
                    tL_messages_prolongWebView.query_id = o4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (o4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(o4Var.F).createReplyInput(o4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (o4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(o4Var.F).getInputPeer(o4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (o4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(o4Var.F).getInputPeer(o4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (o4Var.w < 0 && (chatFull = MessagesController.getInstance(o4Var.F).getChatFull(-o4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(o4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(o4Var.F).sendRequest(tL_messages_prolongWebView, new bi.i0(o4Var, 12));
                    break;
                }
                break;
            case 3:
                o4 o4Var2 = this.b;
                o4Var2.b.e2(o4Var2, 0);
                o4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
