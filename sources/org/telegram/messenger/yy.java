package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
