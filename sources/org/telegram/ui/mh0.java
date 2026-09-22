package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ mh0(yh0 yh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = yh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yh0 yh0Var = this.b;
                yh0Var.getNotificationCenter().doOnIdle(new mh0(yh0Var, this.c, this.d, 1));
                break;
            default:
                yh0.V(this.b, this.c, this.d);
                break;
        }
    }
}
