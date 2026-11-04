package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz0 b;

    public /* synthetic */ dz0(iz0 iz0Var, int i3) {
        this.a = i3;
        this.b = iz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iz0 iz0Var = this.b;
                dz0 dz0Var = iz0Var.a0;
                if (iz0Var.x != null) {
                    iz0Var.b0 = r2.S() / iz0Var.x.U();
                    gz0 gz0Var = iz0Var.O;
                    if (gz0Var != null) {
                        gz0Var.nc = (iz0Var.x.U() - iz0Var.x.S()) / 1000;
                        iz0Var.O.Q3();
                        org.telegram.ui.Components.sm0 seekBarWaveform = iz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = iz0Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (iz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(dz0Var);
                        org.telegram.messenger.g0.i3(dz0Var, 16L);
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
                iz0 iz0Var2 = this.b;
                if (iz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new dz0(iz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = iz0Var2.P;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        iz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
