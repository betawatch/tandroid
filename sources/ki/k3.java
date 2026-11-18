package ki;

import org.telegram.messenger.mp;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ k3(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.ChatFull P0;
        TLRPC.Peer peer;
        switch (this.a) {
            case 0:
                this.b.n.R();
                break;
            case 1:
                this.b.Q();
                break;
            case 2:
                t3 t3Var = this.b;
                if (!t3Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = mp.u1(t3Var.G).q1(t3Var.w);
                    tL_messages_prolongWebView.peer = mp.u1(t3Var.G).l1(t3Var.x);
                    tL_messages_prolongWebView.query_id = t3Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (t3Var.E != 0) {
                        zy.C(t3Var.G);
                        int i7 = t3Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (t3Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = mp.u1(t3Var.G).l1(t3Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (t3Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = mp.u1(t3Var.G).l1(t3Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (t3Var.x < 0 && (P0 = mp.u1(t3Var.G).P0(-t3Var.x)) != null && (peer = P0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = mp.u1(t3Var.G).o1(peer);
                        tL_messages_prolongWebView.flags |= TLObject.FLAG_13;
                    }
                    ConnectionsManager.getInstance(t3Var.G).sendRequest(tL_messages_prolongWebView, new ai.e1(t3Var, 22));
                    break;
                }
                break;
            case 3:
                t3 t3Var2 = this.b;
                t3Var2.b.N1(t3Var2, 0);
                t3Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
