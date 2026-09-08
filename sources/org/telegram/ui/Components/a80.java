package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g80 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ a80(g80 g80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.a = i10;
        this.b = g80Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g80.p(this.b, this.c, this.d);
                break;
            default:
                g80.o(this.b, this.c, this.d);
                break;
        }
    }
}
