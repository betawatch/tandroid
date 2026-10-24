package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class q6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ h7 c;

    public q6(h7 h7Var, long j10, Utilities.Callback callback) {
        this.c = h7Var;
        this.a = j10;
        this.b = callback;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.c3(this, tLObject, this.a, this.b, 10));
    }
}
