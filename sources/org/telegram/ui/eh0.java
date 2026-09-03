package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ eh0(qh0 qh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qh0 qh0Var = this.b;
                qh0Var.getNotificationCenter().doOnIdle(new eh0(qh0Var, this.c, this.d, 1));
                break;
            default:
                qh0.V(this.b, this.c, this.d);
                break;
        }
    }
}
