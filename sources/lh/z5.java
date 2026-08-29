package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ba0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class z5 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ba0 b;
    public final /* synthetic */ s6 c;

    public z5(s6 s6Var, long j10, ba0 ba0Var) {
        this.c = s6Var;
        this.a = j10;
        this.b = ba0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new jh.c2(this, tLObject, this.a, this.b, 9));
    }
}
