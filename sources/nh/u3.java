package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ u3(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
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
                this.b.L();
                break;
            case 2:
                e4 e4Var = this.b;
                if (!e4Var.P) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(e4Var.B).getInputUser(e4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(e4Var.B).getInputPeer(e4Var.w);
                    tL_messages_prolongWebView.query_id = e4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (e4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(e4Var.B).createReplyInput(e4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (e4Var.A != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(e4Var.B).getInputPeer(e4Var.A);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (e4Var.A != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(e4Var.B).getInputPeer(e4Var.A);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (e4Var.w < 0 && (chatFull = MessagesController.getInstance(e4Var.B).getChatFull(-e4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(e4Var.B).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(e4Var.B).sendRequest(tL_messages_prolongWebView, new cf.a(e4Var, 18));
                    break;
                }
                break;
            case 3:
                e4 e4Var2 = this.b;
                e4Var2.b.X1(e4Var2, 0);
                e4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
