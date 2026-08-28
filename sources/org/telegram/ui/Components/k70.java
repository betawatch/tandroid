package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p70 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ k70(p70 p70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i9) {
        this.a = i9;
        this.b = p70Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p70.p(this.b, this.c, this.d);
                break;
            default:
                p70.o(this.b, this.c, this.d);
                break;
        }
    }
}
