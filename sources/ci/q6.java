package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o80;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class q6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ o80 b;
    public final /* synthetic */ i7 c;

    public q6(i7 i7Var, long j10, o80 o80Var) {
        this.c = i7Var;
        this.a = j10;
        this.b = o80Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.a, this.b, 9));
    }
}
