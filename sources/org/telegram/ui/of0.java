package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ of0(fg0 fg0Var, int i7) {
        this.a = i7;
        this.b = fg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                fg0 fg0Var = this.b;
                fg0Var.getClass();
                xh.e.f(false);
                xh.e eVar = fg0Var.i0;
                if (eVar != null) {
                    eVar.b(fg0Var.F);
                }
                org.telegram.messenger.g0.g3(new of0(fg0Var, 0));
                break;
            case 2:
                xh.e.f(false);
                fg0 fg0Var2 = this.b;
                xh.e eVar2 = fg0Var2.i0;
                if (eVar2 != null) {
                    eVar2.b(fg0Var2.F);
                }
                org.telegram.messenger.g0.g3(new of0(fg0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
