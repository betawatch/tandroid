package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ c11(h11 h11Var, int i10) {
        this.a = i10;
        this.b = h11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h11 h11Var = this.b;
                c11 c11Var = h11Var.Z;
                if (h11Var.x != null) {
                    h11Var.a0 = r2.S() / h11Var.x.U();
                    f11 f11Var = h11Var.N;
                    if (f11Var != null) {
                        f11Var.mc = (h11Var.x.U() - h11Var.x.S()) / 1000;
                        h11Var.N.O3();
                        org.telegram.ui.Components.rn0 seekBarWaveform = h11Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = h11Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (h11Var.x.d0()) {
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
                h11 h11Var2 = this.b;
                if (h11Var2.d == null) {
                    org.telegram.messenger.i0.g3(new c11(h11Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = h11Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        h11Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
