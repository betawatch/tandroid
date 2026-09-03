package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;
    public final /* synthetic */ TLRPC.TL_chatInviteExported c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ dh0(qh0 qh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4, int i10) {
        this.a = i10;
        this.b = qh0Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qh0 qh0Var = this.b;
                qh0Var.getNotificationCenter().doOnIdle(new dh0(qh0Var, this.c, this.d, this.e, this.f, 1));
                break;
            default:
                qh0.U(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
