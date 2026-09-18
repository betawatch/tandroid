package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ mg0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wg0 wg0Var = this.b;
                ck0 ck0Var = wg0Var.a;
                xg0 xg0Var = wg0Var.V;
                tg0 tg0Var = wg0Var.b;
                if (tg0Var != null) {
                    if (xg0Var.c0) {
                        ck0Var.clearFocus();
                        tg0Var.clearFocus();
                    } else if (ck0Var.length() != 0) {
                        tg0Var.requestFocus();
                        if (!wg0Var.R) {
                            tg0Var.setSelection(tg0Var.length());
                        }
                        xg0.T0(xg0Var, tg0Var);
                    } else {
                        ck0Var.requestFocus();
                        xg0.T0(xg0Var, ck0Var);
                    }
                }
                if (xg0Var.F == 0) {
                    wg0Var.u(false);
                    break;
                }
                break;
            case 1:
                wg0 wg0Var2 = this.b;
                wg0Var2.postDelayed(new mg0(wg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.u(true);
                break;
            default:
                wg0 wg0Var3 = this.b;
                xg0.T0(wg0Var3.V, wg0Var3.b);
                break;
        }
    }
}
