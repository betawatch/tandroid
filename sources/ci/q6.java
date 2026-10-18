package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o80;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        AndroidUtilities.runOnUIThread(new ai.b2(this, tLObject, this.a, this.b, 9));
    }
}
