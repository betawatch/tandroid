package jh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                n0Var.U(kf.a.i(0L, i10 == 0 ? kf.b.a : kf.b.b), true, false, true);
                n0Var.Z.setText("");
                break;
            case 1:
                s0 s0Var = (s0) this.b;
                s0Var.getClass();
                s0Var.q(kf.a.i(0L, i10 == 0 ? kf.b.a : kf.b.b), true, false, true);
                s0Var.h.setText("");
                break;
            default:
                l4 l4Var = (l4) this.b;
                l4Var.getClass();
                l4Var.q = i10 == 0 ? kf.b.a : kf.b.b;
                l4Var.a(true);
                break;
        }
    }
}
