package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;

    public /* synthetic */ jy(ez ezVar, int i3) {
        this.a = i3;
        this.b = ezVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.p11(28, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new pp(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
