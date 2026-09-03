package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j80 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ e80(j80 j80Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10, int i10) {
        this.a = i10;
        this.b = j80Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j80.p(this.b, this.c, this.d);
                break;
            default:
                j80.o(this.b, this.c, this.d);
                break;
        }
    }
}
