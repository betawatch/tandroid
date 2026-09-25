package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r80 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ l80(r80 r80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j3, int i10) {
        this.a = i10;
        this.b = r80Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r80.p(this.b, this.c, this.d);
                break;
            default:
                r80.o(this.b, this.c, this.d);
                break;
        }
    }
}
