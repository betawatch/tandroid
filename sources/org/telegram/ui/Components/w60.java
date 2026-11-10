package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ w60(b70 b70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i7) {
        this.a = i7;
        this.b = b70Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b70 b70Var = this.b;
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(b70Var.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
                s12.Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2.b(b70Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                b70 b70Var2 = this.b;
                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(b70Var2.a);
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView2 = this.c;
                s13.Y3(tL_chatInviteJoinResultWebView2.users, false);
                org.telegram.messenger.k2.b(b70Var2.a).c(this.d, tL_chatInviteJoinResultWebView2.bot_id, tL_chatInviteJoinResultWebView2.query_id, false);
                break;
        }
    }
}
