package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u80 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ o80(u80 u80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.a = i10;
        this.b = u80Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u80.p(this.b, this.c, this.d);
                break;
            default:
                u80.o(this.b, this.c, this.d);
                break;
        }
    }
}
