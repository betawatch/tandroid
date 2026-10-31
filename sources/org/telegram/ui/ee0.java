package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ ee0(me0 me0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = me0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                me0 me0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.i0.g3(new f70(24, me0Var, tL_error));
                        break;
                    }
                } else {
                    Bundle bundle = this.c;
                    org.telegram.messenger.i0.g3(new qd0(me0Var, bundle, tLObject, false, 4));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new w50(this.b, tL_error, this.c, tLObject, 9));
                break;
        }
    }
}
