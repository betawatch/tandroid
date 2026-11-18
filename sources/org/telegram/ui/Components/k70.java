package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p70 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ k70(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.a = i7;
        this.b = p70Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p70 p70Var = this.b;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(p70Var.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
                u12.f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(p70Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                p70 p70Var2 = this.b;
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(p70Var2.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.c;
                u13.f4(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.l2.b(p70Var2.a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                break;
        }
    }
}
