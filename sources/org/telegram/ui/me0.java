package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ me0(xe0 xe0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3) {
        this.a = i3;
        this.b = xe0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xe0 xe0Var = this.b;
                xe0Var.getNotificationCenter().d(new me0(xe0Var, this.c, this.d, 1));
                break;
            default:
                xe0.a0(this.b, this.c, this.d);
                break;
        }
    }
}
