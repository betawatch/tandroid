package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y7 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ta0 b;
    public final /* synthetic */ u8 c;

    public y7(u8 u8Var, long j3, ta0 ta0Var) {
        this.c = u8Var;
        this.a = j3;
        this.b = ta0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x7(this, tLObject, this.a, this.b, 1));
    }
}
