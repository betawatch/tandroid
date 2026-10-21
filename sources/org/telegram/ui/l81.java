package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p91 b;

    public /* synthetic */ l81(p91 p91Var, int i10) {
        this.a = i10;
        this.b = p91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                p91.U(this.b, tLObject);
                break;
            default:
                p91.V(this.b, tLObject);
                break;
        }
    }
}
