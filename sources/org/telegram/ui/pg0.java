package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;

    public /* synthetic */ pg0(zg0 zg0Var, int i10) {
        this.a = i10;
        this.b = zg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zg0 zg0Var = this.b;
                fk0 fk0Var = zg0Var.a;
                ah0 ah0Var = zg0Var.V;
                wg0 wg0Var = zg0Var.b;
                if (wg0Var != null) {
                    if (ah0Var.c0) {
                        fk0Var.clearFocus();
                        wg0Var.clearFocus();
                    } else if (fk0Var.length() != 0) {
                        wg0Var.requestFocus();
                        if (!zg0Var.R) {
                            wg0Var.setSelection(wg0Var.length());
                        }
                        ah0.T0(ah0Var, wg0Var);
                    } else {
                        fk0Var.requestFocus();
                        ah0.T0(ah0Var, fk0Var);
                    }
                }
                if (ah0Var.F == 0) {
                    zg0Var.s(false);
                    break;
                }
                break;
            case 1:
                zg0 zg0Var2 = this.b;
                zg0Var2.postDelayed(new pg0(zg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.s(true);
                break;
            default:
                zg0 zg0Var3 = this.b;
                ah0.T0(zg0Var3.V, zg0Var3.b);
                break;
        }
    }
}
