package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ nf0(eg0 eg0Var, int i7) {
        this.a = i7;
        this.b = eg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                eg0 eg0Var = this.b;
                eg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = eg0Var.i0;
                if (eVar != null) {
                    eVar.b(eg0Var.F);
                }
                org.telegram.messenger.g0.g3(new nf0(eg0Var, 0));
                break;
            case 2:
                xh.e.f(false);
                eg0 eg0Var2 = this.b;
                xh.e eVar2 = eg0Var2.i0;
                if (eVar2 != null) {
                    eVar2.b(eg0Var2.F);
                }
                org.telegram.messenger.g0.g3(new nf0(eg0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
