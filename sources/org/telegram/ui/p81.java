package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t91 b;

    public /* synthetic */ p81(t91 t91Var, int i10) {
        this.a = i10;
        this.b = t91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                t91.U(this.b, tLObject);
                break;
            default:
                t91.V(this.b, tLObject);
                break;
        }
    }
}
