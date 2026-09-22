package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.va0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class q8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ va0 b;
    public final /* synthetic */ l9 c;

    public q8(l9 l9Var, long j3, va0 va0Var) {
        this.c = l9Var;
        this.a = j3;
        this.b = va0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.a, this.b, 1));
    }
}
