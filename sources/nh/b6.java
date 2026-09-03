package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
