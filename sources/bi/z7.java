package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z7 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ e2.h b;
    public final /* synthetic */ u8 c;

    public z7(u8 u8Var, long j3, e2.h hVar) {
        this.c = u8Var;
        this.a = j3;
        this.b = hVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x7(this, tLObject, this.a, this.b, 2));
    }
}
