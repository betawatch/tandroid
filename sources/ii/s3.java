package ii;

import org.telegram.messenger.hp;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ s3(d4 d4Var, int i3) {
        this.a = i3;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.Q();
                break;
            case 1:
                this.b.P();
                break;
            case 2:
                d4 d4Var = this.b;
                if (!d4Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = hp.s1(d4Var.G).o1(d4Var.w);
                    tL_messages_prolongWebView.peer = hp.s1(d4Var.G).j1(d4Var.x);
                    tL_messages_prolongWebView.query_id = d4Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (d4Var.E != 0) {
                        yy.C(d4Var.G);
                        int i3 = d4Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i3;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (d4Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = hp.s1(d4Var.G).j1(d4Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (d4Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = hp.s1(d4Var.G).j1(d4Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (d4Var.x < 0 && (N0 = hp.s1(d4Var.G).N0(-d4Var.x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = hp.s1(d4Var.G).m1(peer);
                        tL_messages_prolongWebView.flags |= TLObject.FLAG_13;
                    }
                    ConnectionsManager.getInstance(d4Var.G).sendRequest(tL_messages_prolongWebView, new ci.d0(d4Var, 12));
                    break;
                }
                break;
            case 3:
                d4 d4Var2 = this.b;
                d4Var2.b.M1(d4Var2, 0);
                d4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
