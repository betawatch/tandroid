package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class b6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ h5.d b;
    public final /* synthetic */ t6 c;

    public b6(t6 t6Var, long j10, h5.d dVar) {
        this.c = t6Var;
        this.a = j10;
        this.b = dVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new lh.c2(this, tLObject, this.a, this.b, 10));
    }
}
