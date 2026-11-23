package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ mf0(dg0 dg0Var, int i7) {
        this.a = i7;
        this.b = dg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                dg0 dg0Var = this.b;
                dg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = dg0Var.i0;
                if (eVar != null) {
                    eVar.b(dg0Var.F);
                }
                org.telegram.messenger.g0.g3(new mf0(dg0Var, 0));
                break;
            case 2:
                xh.e.f(false);
                dg0 dg0Var2 = this.b;
                xh.e eVar2 = dg0Var2.i0;
                if (eVar2 != null) {
                    eVar2.b(dg0Var2.F);
                }
                org.telegram.messenger.g0.g3(new mf0(dg0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
