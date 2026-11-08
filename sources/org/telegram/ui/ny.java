package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ ny(gz gzVar, int i7) {
        this.a = i7;
        this.b = gzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(23, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new rp(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
