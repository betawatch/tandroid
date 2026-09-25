package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sh0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ gh0(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = sh0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sh0 sh0Var = this.b;
                sh0Var.getNotificationCenter().doOnIdle(new gh0(sh0Var, this.c, this.d, 1));
                break;
            default:
                sh0.V(this.b, this.c, this.d);
                break;
        }
    }
}
