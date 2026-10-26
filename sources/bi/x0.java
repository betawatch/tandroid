package bi;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                b1Var.getClass();
                b1Var.U(bg.a.i(0L, i10 == 0 ? bg.b.a : bg.b.b), true, false, true);
                b1Var.e0.setText("");
                break;
            case 1:
                g1 g1Var = (g1) this.b;
                g1Var.getClass();
                g1Var.q(bg.a.i(0L, i10 == 0 ? bg.b.a : bg.b.b), true, false, true);
                g1Var.h.setText("");
                break;
            default:
                g6 g6Var = (g6) this.b;
                g6Var.getClass();
                g6Var.q = i10 == 0 ? bg.b.a : bg.b.b;
                g6Var.a(true);
                break;
        }
    }
}
