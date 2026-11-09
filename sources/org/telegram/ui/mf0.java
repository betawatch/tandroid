package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                xh.e eVar = dg0Var.h0;
                if (eVar != null) {
                    eVar.b(dg0Var.E);
                }
                org.telegram.messenger.g0.h3(new mf0(dg0Var, 0));
                break;
            case 2:
                xh.e.f(false);
                dg0 dg0Var2 = this.b;
                xh.e eVar2 = dg0Var2.h0;
                if (eVar2 != null) {
                    eVar2.b(dg0Var2.E);
                }
                org.telegram.messenger.g0.h3(new mf0(dg0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
