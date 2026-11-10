package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ fk0(kl0 kl0Var, int i7) {
        this.a = i7;
        this.b = kl0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new jk0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new tc0(25, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new jk0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.g0.h3(new nk0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
