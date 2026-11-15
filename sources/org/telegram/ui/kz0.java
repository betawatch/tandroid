package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz0 b;

    public /* synthetic */ kz0(pz0 pz0Var, int i7) {
        this.a = i7;
        this.b = pz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pz0 pz0Var = this.b;
                kz0 kz0Var = pz0Var.a0;
                if (pz0Var.x != null) {
                    pz0Var.b0 = r2.S() / pz0Var.x.U();
                    nz0 nz0Var = pz0Var.O;
                    if (nz0Var != null) {
                        nz0Var.pc = (pz0Var.x.U() - pz0Var.x.S()) / 1000;
                        pz0Var.O.T3();
                        org.telegram.ui.Components.tm0 seekBarWaveform = pz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = pz0Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (pz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(kz0Var);
                        org.telegram.messenger.g0.i3(kz0Var, 16L);
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
                pz0 pz0Var2 = this.b;
                if (pz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new kz0(pz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = pz0Var2.P;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        pz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
