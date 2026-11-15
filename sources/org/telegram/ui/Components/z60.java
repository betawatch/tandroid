package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e70 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ z60(e70 e70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.a = i7;
        this.b = e70Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e70 e70Var = this.b;
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(e70Var.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
                s12.Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(e70Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                e70 e70Var2 = this.b;
                org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(e70Var2.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.c;
                s13.Y3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.k2.b(e70Var2.a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                break;
        }
    }
}
