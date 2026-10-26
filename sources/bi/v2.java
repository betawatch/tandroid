package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v2(h7 h7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.b = h7Var;
        this.c = j10;
        this.d = j11;
        this.f = callback;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.b, (org.telegram.ui.ActionBar.e2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new e3(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ v2(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, long j10, long j11, long j12) {
        this.b = h7Var;
        this.f = e2Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
