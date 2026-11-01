package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ at0(jt0 jt0Var, int i10) {
        this.a = i10;
        this.b = jt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jt0 jt0Var = this.b;
                org.telegram.messenger.i0.g3(new at0(jt0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = jt0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = jt0Var.L;
                    q1Var2.b6 = null;
                    q1Var2.invalidate();
                }
                pm pmVar = jt0Var.e0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    jt0Var.e0 = null;
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

    public /* synthetic */ at0(jt0 jt0Var, boolean z10) {
        this.a = 0;
        this.b = jt0Var;
    }
}
