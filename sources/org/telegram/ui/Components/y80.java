package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d90 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ y80(d90 d90Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.a = i10;
        this.b = d90Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d90.p(this.b, this.c, this.d);
                break;
            default:
                d90.o(this.b, this.c, this.d);
                break;
        }
    }
}
