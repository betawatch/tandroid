package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ad0(bd0 bd0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = bd0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new xc0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                org.telegram.messenger.i0.g3(new xc0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
