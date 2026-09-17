package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class y7 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ ta0 b;
    public final /* synthetic */ u8 c;

    public y7(u8 u8Var, long j3, ta0 ta0Var) {
        this.c = u8Var;
        this.a = j3;
        this.b = ta0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new x7(this, tLObject, this.a, this.b, 1));
    }
}
