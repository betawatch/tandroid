package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ e3(h7 h7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.b = h7Var;
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
                h7.k1(this.b, (org.telegram.ui.ActionBar.e2) this.n, this.c, this.d, this.e, this.h, this.f);
                break;
            default:
                h7.k0(this.b, this.c, this.d, this.e, (Utilities.Callback) this.n, this.f, this.h);
                break;
        }
    }

    public /* synthetic */ e3(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.b = h7Var;
        this.n = e2Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f = tL_error;
    }
}
