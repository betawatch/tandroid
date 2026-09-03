package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ fh0(rh0 rh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = rh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rh0 rh0Var = this.b;
                rh0Var.getNotificationCenter().doOnIdle(new fh0(rh0Var, this.c, this.d, 1));
                break;
            default:
                rh0.V(this.b, this.c, this.d);
                break;
        }
    }
}
