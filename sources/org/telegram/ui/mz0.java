package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz0 b;

    public /* synthetic */ mz0(rz0 rz0Var, int i7) {
        this.a = i7;
        this.b = rz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rz0 rz0Var = this.b;
                mz0 mz0Var = rz0Var.Z;
                if (rz0Var.x != null) {
                    rz0Var.a0 = r2.S() / rz0Var.x.U();
                    pz0 pz0Var = rz0Var.N;
                    if (pz0Var != null) {
                        pz0Var.oc = (rz0Var.x.U() - rz0Var.x.S()) / 1000;
                        rz0Var.N.S3();
                        org.telegram.ui.Components.pm0 seekBarWaveform = rz0Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = rz0Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (rz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(mz0Var);
                        org.telegram.messenger.g0.i3(mz0Var, 16L);
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
                rz0 rz0Var2 = this.b;
                if (rz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new mz0(rz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = rz0Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        rz0Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
