package di;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;

    public /* synthetic */ j4(u4 u4Var, int i10) {
        this.a = i10;
        this.b = u4Var;
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
                u4 u4Var = this.b;
                if (!u4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(u4Var.F).getInputUser(u4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(u4Var.F).getInputPeer(u4Var.w);
                    tL_messages_prolongWebView.query_id = u4Var.x;
                    tL_messages_prolongWebView.silent = false;
                    if (u4Var.y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(u4Var.F).createReplyInput(u4Var.y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (u4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(u4Var.F).getInputPeer(u4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (u4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(u4Var.F).getInputPeer(u4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (u4Var.w < 0 && (chatFull = MessagesController.getInstance(u4Var.F).getChatFull(-u4Var.w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(u4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(u4Var.F).sendRequest(tL_messages_prolongWebView, new bi.c2(u4Var, 4));
                    break;
                }
                break;
            case 3:
                u4 u4Var2 = this.b;
                u4Var2.b.X1(u4Var2, 0);
                u4Var2.n.o(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.o(true, false);
                break;
        }
    }
}
