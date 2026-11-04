package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf0 b;

    public /* synthetic */ ef0(vf0 vf0Var, int i3) {
        this.a = i3;
        this.b = vf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                vf0 vf0Var = this.b;
                vf0Var.getClass();
                yh.e.f(false);
                yh.e eVar = vf0Var.i0;
                if (eVar != null) {
                    eVar.b(vf0Var.F);
                }
                org.telegram.messenger.g0.h3(new ef0(vf0Var, 0));
                break;
            case 2:
                yh.e.f(false);
                vf0 vf0Var2 = this.b;
                yh.e eVar2 = vf0Var2.i0;
                if (eVar2 != null) {
                    eVar2.b(vf0Var2.F);
                }
                org.telegram.messenger.g0.h3(new ef0(vf0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
