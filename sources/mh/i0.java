package mh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                m0Var.getClass();
                m0Var.U(mf.a.i(0L, i10 == 0 ? mf.b.a : mf.b.b), true, false, true);
                m0Var.a0.setText("");
                break;
            case 1:
                r0 r0Var = (r0) this.b;
                r0Var.getClass();
                r0Var.q(mf.a.i(0L, i10 == 0 ? mf.b.a : mf.b.b), true, false, true);
                r0Var.h.setText("");
                break;
            default:
                k4 k4Var = (k4) this.b;
                k4Var.getClass();
                k4Var.q = i10 == 0 ? mf.b.a : mf.b.b;
                k4Var.a(true);
                break;
        }
    }
}
