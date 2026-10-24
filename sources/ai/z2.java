package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(l7 l7Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.b = l7Var;
        this.c = j10;
        this.d = j11;
        this.f = callback;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i3(this.b, (org.telegram.ui.ActionBar.c2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new i3(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ z2(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, long j10, long j11, long j12) {
        this.b = l7Var;
        this.f = c2Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
