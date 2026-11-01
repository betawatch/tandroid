package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class jz implements RequestDelegate {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ kz b;

    public jz(kz kzVar, Runnable runnable) {
        this.b = kzVar;
        this.a = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new lg(this, tLObject, this.a, 29));
    }
}
