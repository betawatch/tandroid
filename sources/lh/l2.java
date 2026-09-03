package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ l2(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.b = g5Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.n = callback;
        this.f = tL_error;
        this.h = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g5.H0(this.b, (org.telegram.ui.ActionBar.d2) this.n, this.c, this.d, this.e, this.h, this.f);
                break;
            default:
                g5.f0(this.b, this.c, this.d, this.e, (Utilities.Callback) this.n, this.f, this.h);
                break;
        }
    }

    public /* synthetic */ l2(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.b = g5Var;
        this.n = d2Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f = tL_error;
    }
}
