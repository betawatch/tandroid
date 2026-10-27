package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;

    public /* synthetic */ q81(y91 y91Var, int i10) {
        this.a = i10;
        this.b = y91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                y91.W(this.b, tLObject);
                break;
            default:
                y91.V(this.b, tLObject);
                break;
        }
    }
}
