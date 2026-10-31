package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt0 b;

    public /* synthetic */ bt0(kt0 kt0Var, int i10) {
        this.a = i10;
        this.b = kt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kt0 kt0Var = this.b;
                org.telegram.messenger.i0.g3(new bt0(kt0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = kt0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = kt0Var.L;
                    q1Var2.b6 = null;
                    q1Var2.invalidate();
                }
                pm pmVar = kt0Var.e0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    kt0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ bt0(kt0 kt0Var, boolean z10) {
        this.a = 0;
        this.b = kt0Var;
    }
}
