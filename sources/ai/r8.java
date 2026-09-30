package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oa0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class r8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ oa0 b;
    public final /* synthetic */ l9 c;

    public r8(l9 l9Var, long j3, oa0 oa0Var) {
        this.c = l9Var;
        this.a = j3;
        this.b = oa0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.a, this.b, 1));
    }
}
