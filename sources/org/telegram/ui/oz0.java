package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz0 b;

    public /* synthetic */ oz0(tz0 tz0Var, int i7) {
        this.a = i7;
        this.b = tz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tz0 tz0Var = this.b;
                oz0 oz0Var = tz0Var.a0;
                if (tz0Var.x != null) {
                    tz0Var.b0 = r2.S() / tz0Var.x.U();
                    rz0 rz0Var = tz0Var.O;
                    if (rz0Var != null) {
                        rz0Var.pc = (tz0Var.x.U() - tz0Var.x.S()) / 1000;
                        tz0Var.O.U3();
                        org.telegram.ui.Components.bn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = tz0Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.n;
                            if (r1Var != null) {
                                r1Var.invalidate();
                            }
                        }
                    }
                    if (tz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(oz0Var);
                        org.telegram.messenger.g0.h3(oz0Var, 16L);
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
                tz0 tz0Var2 = this.b;
                if (tz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new oz0(tz0Var2, 2));
                    org.telegram.ui.Cells.r1 r1Var2 = tz0Var2.P;
                    if (r1Var2 != null) {
                        r1Var2.setVisibility(0);
                        tz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
