package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        AndroidUtilities.runOnUIThread(new bi.y2(this, tLObject, this.a, this.b, 10));
    }
}
