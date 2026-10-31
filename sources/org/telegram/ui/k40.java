package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m40 b;

    public /* synthetic */ k40(m40 m40Var, int i10) {
        this.a = i10;
        this.b = m40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m40 m40Var = this.b;
                bi.t0 t0Var = m40Var.b;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                org.telegram.messenger.i0.h3(new k40(m40Var, 2), 16L);
                break;
            case 1:
                bi.t0 t0Var2 = this.b.b;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
