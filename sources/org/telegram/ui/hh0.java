package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ th0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ hh0(th0 th0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = th0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                th0 th0Var = this.b;
                th0Var.getNotificationCenter().doOnIdle(new hh0(th0Var, this.c, this.d, 1));
                break;
            default:
                th0.V(this.b, this.c, this.d);
                break;
        }
    }
}
