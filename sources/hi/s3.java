package hi;

import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ s3(c4 c4Var, int i7) {
        this.a = i7;
        this.b = c4Var;
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
                this.b.P();
                break;
            case 2:
                c4 c4Var = this.b;
                if (!c4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = qp.s1(c4Var.F).o1(c4Var.w);
                    tL_messages_prolongWebView.peer = qp.s1(c4Var.F).j1(c4Var.x);
                    tL_messages_prolongWebView.query_id = c4Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (c4Var.D != 0) {
                        gz.C(c4Var.F);
                        int i7 = c4Var.D;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (c4Var.E != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = qp.s1(c4Var.F).j1(c4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (c4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = qp.s1(c4Var.F).j1(c4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (c4Var.x < 0 && (N0 = qp.s1(c4Var.F).N0(-c4Var.x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = qp.s1(c4Var.F).m1(peer);
                        tL_messages_prolongWebView.flags |= TLObject.FLAG_13;
                    }
                    ConnectionsManager.getInstance(c4Var.F).sendRequest(tL_messages_prolongWebView, new bi.j0(c4Var, 12));
                    break;
                }
                break;
            case 3:
                c4 c4Var2 = this.b;
                c4Var2.b.M1(c4Var2, 0);
                c4Var2.n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.b.n.n(true, false);
                break;
        }
    }
}
