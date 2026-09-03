package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ d80(i80 i80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.a = i10;
        this.b = i80Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i80.p(this.b, this.c, this.d);
                break;
            default:
                i80.o(this.b, this.c, this.d);
                break;
        }
    }
}
