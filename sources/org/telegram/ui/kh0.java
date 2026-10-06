package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ kh0(wh0 wh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = wh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wh0 wh0Var = this.b;
                wh0Var.getNotificationCenter().doOnIdle(new kh0(wh0Var, this.c, this.d, 1));
                break;
            default:
                wh0.T(this.b, this.c, this.d);
                break;
        }
    }
}
