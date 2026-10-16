package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wa0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class c8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ wa0 b;
    public final /* synthetic */ x8 c;

    public c8(x8 x8Var, long j10, wa0 wa0Var) {
        this.c = x8Var;
        this.a = j10;
        this.b = wa0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b8(this, tLObject, this.a, this.b, 1));
    }
}
