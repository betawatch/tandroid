package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.m80;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class q6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ m80 b;
    public final /* synthetic */ i7 c;

    public q6(i7 i7Var, long j10, m80 m80Var) {
        this.c = i7Var;
        this.a = j10;
        this.b = m80Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.a, this.b, 9));
    }
}
