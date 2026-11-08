package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class yy implements RequestDelegate {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ zy b;

    public yy(zy zyVar, Runnable runnable) {
        this.b = zyVar;
        this.a = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new lg(this, tLObject, this.a, 28));
    }
}
