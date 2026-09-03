package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ eg0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                og0 og0Var = this.b;
                sj0 sj0Var = og0Var.a;
                pg0 pg0Var = og0Var.S;
                lg0 lg0Var = og0Var.b;
                if (lg0Var != null) {
                    if (pg0Var.Z) {
                        sj0Var.clearFocus();
                        lg0Var.clearFocus();
                    } else if (sj0Var.length() != 0) {
                        lg0Var.requestFocus();
                        if (!og0Var.O) {
                            lg0Var.setSelection(lg0Var.length());
                        }
                        pg0.T0(pg0Var, lg0Var);
                    } else {
                        sj0Var.requestFocus();
                        pg0.T0(pg0Var, sj0Var);
                    }
                }
                if (pg0Var.C == 0) {
                    og0Var.t(false);
                    break;
                }
                break;
            case 1:
                og0 og0Var2 = this.b;
                og0Var2.postDelayed(new eg0(og0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                og0 og0Var3 = this.b;
                pg0.T0(og0Var3.S, og0Var3.b);
                break;
        }
    }
}
