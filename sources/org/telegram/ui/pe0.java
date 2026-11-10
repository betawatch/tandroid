package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff0 b;

    public /* synthetic */ pe0(ff0 ff0Var, int i7) {
        this.a = i7;
        this.b = ff0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ue0(this.b, tL_error, tLObject, 0));
                break;
            default:
                org.telegram.messenger.g0.h3(new tc0(9, this.b, tL_error));
                break;
        }
    }
}
