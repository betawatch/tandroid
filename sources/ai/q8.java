package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ta0 b;
    public final /* synthetic */ l9 c;

    public q8(l9 l9Var, long j3, ta0 ta0Var) {
        this.c = l9Var;
        this.a = j3;
        this.b = ta0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.a, this.b, 1));
    }
}
