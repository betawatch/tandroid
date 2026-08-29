package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y1(h5 h5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.b = h5Var;
        this.c = j10;
        this.d = j11;
        this.f = callback;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l2(this.b, (org.telegram.ui.ActionBar.c2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l2(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ y1(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, long j10, long j11, long j12) {
        this.b = h5Var;
        this.f = c2Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
