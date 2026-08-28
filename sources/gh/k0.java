package gh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                o0Var.getClass();
                o0Var.T(gf.a.i(0L, i9 == 0 ? gf.b.a : gf.b.b), true, false, true);
                o0Var.Z.setText("");
                break;
            case 1:
                t0 t0Var = (t0) this.b;
                t0Var.getClass();
                t0Var.q(gf.a.i(0L, i9 == 0 ? gf.b.a : gf.b.b), true, false, true);
                t0Var.h.setText("");
                break;
            default:
                o4 o4Var = (o4) this.b;
                o4Var.getClass();
                o4Var.q = i9 == 0 ? gf.b.a : gf.b.b;
                o4Var.a(true);
                break;
        }
    }
}
