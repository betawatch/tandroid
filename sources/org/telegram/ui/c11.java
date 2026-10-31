package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;

    public /* synthetic */ c11(i11 i11Var, int i10) {
        this.a = i10;
        this.b = i11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i11 i11Var = this.b;
                c11 c11Var = i11Var.Z;
                if (i11Var.x != null) {
                    i11Var.a0 = r2.S() / i11Var.x.U();
                    g11 g11Var = i11Var.N;
                    if (g11Var != null) {
                        g11Var.mc = (i11Var.x.U() - i11Var.x.S()) / 1000;
                        i11Var.N.O3();
                        org.telegram.ui.Components.qn0 seekBarWaveform = i11Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = i11Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (i11Var.x.d0()) {
                        org.telegram.messenger.i0.r(c11Var);
                        org.telegram.messenger.i0.h3(c11Var, 16L);
                        break;
                    }
                }
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                i11 i11Var2 = this.b;
                if (i11Var2.d == null) {
                    org.telegram.messenger.i0.g3(new c11(i11Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = i11Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        i11Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
