package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s91 b;

    public /* synthetic */ o81(s91 s91Var, int i9) {
        this.a = i9;
        this.b = s91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                s91.T(this.b, tLObject);
                break;
            default:
                s91.U(this.b, tLObject);
                break;
        }
    }
}
