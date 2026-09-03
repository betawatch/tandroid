package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y1(g5 g5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.b = g5Var;
        this.c = j10;
        this.d = j11;
        this.f = callback;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l2(this.b, (org.telegram.ui.ActionBar.d2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l2(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ y1(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, long j10, long j11, long j12) {
        this.b = g5Var;
        this.f = d2Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
