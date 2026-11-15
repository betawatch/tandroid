package ki;

import org.telegram.messenger.ez;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ p3(y3 y3Var, int i7) {
        this.a = i7;
        this.b = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.R();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                y3 y3Var = this.b;
                if (!y3Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = np.s1(y3Var.G).o1(y3Var.w);
                    tL_messages_prolongWebView.peer = np.s1(y3Var.G).j1(y3Var.x);
                    tL_messages_prolongWebView.query_id = y3Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (y3Var.E != 0) {
                        ez.C(y3Var.G);
                        int i7 = y3Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (y3Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = np.s1(y3Var.G).j1(y3Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (y3Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = np.s1(y3Var.G).j1(y3Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (y3Var.x < 0 && (N0 = np.s1(y3Var.G).N0(-y3Var.x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = np.s1(y3Var.G).m1(peer);
                        tL_messages_prolongWebView.flags |= TLObject.FLAG_13;
                    }
                    ConnectionsManager.getInstance(y3Var.G).sendRequest(tL_messages_prolongWebView, new ai.d1(y3Var, 20));
                    break;
                }
                break;
            case 3:
                y3 y3Var2 = this.b;
                y3Var2.b.M1(y3Var2, 0);
                y3Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
