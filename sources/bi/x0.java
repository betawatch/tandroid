package bi;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
