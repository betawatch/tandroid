package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nc0(wc0 wc0Var, String str, int i10) {
        this.a = i10;
        this.b = wc0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new pc0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                org.telegram.messenger.i0.g3(new pc0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
