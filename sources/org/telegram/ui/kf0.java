package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ kf0(bg0 bg0Var, int i7) {
        this.a = i7;
        this.b = bg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                bg0 bg0Var = this.b;
                bg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = bg0Var.h0;
                if (eVar != null) {
                    eVar.b(bg0Var.E);
                }
                org.telegram.messenger.g0.h3(new kf0(bg0Var, 0));
                break;
            case 2:
                xh.e.f(false);
                bg0 bg0Var2 = this.b;
                xh.e eVar2 = bg0Var2.h0;
                if (eVar2 != null) {
                    eVar2.b(bg0Var2.E);
                }
                org.telegram.messenger.g0.h3(new kf0(bg0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
