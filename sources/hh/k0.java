package hh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                o0Var.getClass();
                o0Var.U(hf.a.i(0L, i10 == 0 ? hf.b.a : hf.b.b), true, false, true);
                o0Var.Z.setText("");
                break;
            case 1:
                t0 t0Var = (t0) this.b;
                t0Var.getClass();
                t0Var.r(hf.a.i(0L, i10 == 0 ? hf.b.a : hf.b.b), true, false, true);
                t0Var.h.setText("");
                break;
            default:
                m4 m4Var = (m4) this.b;
                m4Var.getClass();
                m4Var.q = i10 == 0 ? hf.b.a : hf.b.b;
                m4Var.a(true);
                break;
        }
    }
}
