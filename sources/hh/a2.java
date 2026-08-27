package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a2(i5 i5Var, long j10, long j11, Utilities.Callback callback, long j12) {
        this.b = i5Var;
        this.c = j10;
        this.d = j11;
        this.f = callback;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n2(this.b, (org.telegram.ui.ActionBar.b2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new n2(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ a2(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, long j10, long j11, long j12) {
        this.b = i5Var;
        this.f = b2Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
