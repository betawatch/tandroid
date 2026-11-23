package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz0 b;

    public /* synthetic */ pz0(uz0 uz0Var, int i7) {
        this.a = i7;
        this.b = uz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uz0 uz0Var = this.b;
                pz0 pz0Var = uz0Var.a0;
                if (uz0Var.x != null) {
                    uz0Var.b0 = r2.S() / uz0Var.x.U();
                    sz0 sz0Var = uz0Var.O;
                    if (sz0Var != null) {
                        sz0Var.pc = (uz0Var.x.U() - uz0Var.x.S()) / 1000;
                        uz0Var.O.U3();
                        org.telegram.ui.Components.en0 seekBarWaveform = uz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = uz0Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.n;
                            if (r1Var != null) {
                                r1Var.invalidate();
                            }
                        }
                    }
                    if (uz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(pz0Var);
                        org.telegram.messenger.g0.h3(pz0Var, 16L);
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
                uz0 uz0Var2 = this.b;
                if (uz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new pz0(uz0Var2, 2));
                    org.telegram.ui.Cells.r1 r1Var2 = uz0Var2.P;
                    if (r1Var2 != null) {
                        r1Var2.setVisibility(0);
                        uz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
