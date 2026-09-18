package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class q8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ua0 b;
    public final /* synthetic */ l9 c;

    public q8(l9 l9Var, long j3, ua0 ua0Var) {
        this.c = l9Var;
        this.a = j3;
        this.b = ua0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.a, this.b, 1));
    }
}
