package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
