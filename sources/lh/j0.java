package lh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                n0Var.getClass();
                n0Var.U(lf.a.i(0L, i10 == 0 ? lf.b.a : lf.b.b), true, false, true);
                n0Var.a0.setText("");
                break;
            case 1:
                s0 s0Var = (s0) this.b;
                s0Var.getClass();
                s0Var.q(lf.a.i(0L, i10 == 0 ? lf.b.a : lf.b.b), true, false, true);
                s0Var.h.setText("");
                break;
            default:
                k4 k4Var = (k4) this.b;
                k4Var.getClass();
                k4Var.q = i10 == 0 ? lf.b.a : lf.b.b;
                k4Var.a(true);
                break;
        }
    }
}
