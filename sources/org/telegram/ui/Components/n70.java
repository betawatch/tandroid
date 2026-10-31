package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u70 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ n70(u70 u70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.a = i10;
        this.b = u70Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u70 u70Var = this.b;
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(u70Var.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
                r12.V3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.o2.b(u70Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                u70 u70Var2 = this.b;
                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(u70Var2.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.c;
                r13.V3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.o2.b(u70Var2.a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                break;
        }
    }
}
