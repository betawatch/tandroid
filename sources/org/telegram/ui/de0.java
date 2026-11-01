package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ de0(le0 le0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = le0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                le0 le0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.i0.g3(new y60(25, le0Var, tL_error));
                        break;
                    }
                } else {
                    Bundle bundle = this.c;
                    org.telegram.messenger.i0.g3(new pd0(le0Var, bundle, tLObject, false, 4));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new v50(this.b, tL_error, this.c, tLObject, 9));
                break;
        }
    }
}
