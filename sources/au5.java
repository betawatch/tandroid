// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class au5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu5 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ au5(fu5 fu5Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, byte b) {
        this.a = b;
        this.b = fu5Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                na7.q1(fu5Var.a).b4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(fu5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                na7.q1(fu5Var.a).b4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(fu5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
        }
    }
}
