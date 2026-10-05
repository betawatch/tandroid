package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sa0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class r8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ sa0 b;
    public final /* synthetic */ l9 c;

    public r8(l9 l9Var, long j3, sa0 sa0Var) {
        this.c = l9Var;
        this.a = j3;
        this.b = sa0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new q8(this, tLObject, this.a, this.b, 1));
    }
}
