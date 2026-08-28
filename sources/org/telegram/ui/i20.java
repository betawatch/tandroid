package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ i20(o50 o50Var, int i9) {
        this.a = i9;
        this.b = o50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                o50.u(this.b, tLObject);
                break;
            default:
                o50.s(this.b, tLObject);
                break;
        }
    }
}
