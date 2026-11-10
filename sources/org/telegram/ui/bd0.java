package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ bd0(jd0 jd0Var, Bundle bundle, int i7) {
        this.a = i7;
        this.b = jd0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                jd0 jd0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        org.telegram.messenger.g0.h3(new tc0(2, jd0Var, tL_error));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new pc0(jd0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(this.b, tL_error, this.c, tLObject, 19));
                break;
        }
    }
}
