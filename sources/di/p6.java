package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ t80 b;
    public final /* synthetic */ h7 c;

    public p6(h7 h7Var, long j10, t80 t80Var) {
        this.c = h7Var;
        this.a = j10;
        this.b = t80Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bi.y2(this, tLObject, this.a, this.b, 9));
    }
}
