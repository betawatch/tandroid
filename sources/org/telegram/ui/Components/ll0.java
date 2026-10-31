package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nl0 b;

    public /* synthetic */ ll0(nl0 nl0Var, int i10) {
        this.a = i10;
        this.b = nl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nl0 nl0Var = this.b;
                nl0Var.getClass();
                org.telegram.messenger.i0.g3(new ll0(nl0Var, 2));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new ll0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
