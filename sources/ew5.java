// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jw5 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ ew5(jw5 jw5Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, byte b) {
        this.a = b;
        this.b = jw5Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
        jw5 jw5Var = this.b;
        switch (b) {
            case 0:
                uc7.s1(jw5Var.a).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(jw5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                uc7.s1(jw5Var.a).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(jw5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
        }
    }
}
