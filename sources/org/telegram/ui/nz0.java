package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz0 b;

    public /* synthetic */ nz0(sz0 sz0Var, int i7) {
        this.a = i7;
        this.b = sz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sz0 sz0Var = this.b;
                nz0 nz0Var = sz0Var.a0;
                if (sz0Var.x != null) {
                    sz0Var.b0 = r2.S() / sz0Var.x.U();
                    qz0 qz0Var = sz0Var.O;
                    if (qz0Var != null) {
                        qz0Var.pc = (sz0Var.x.U() - sz0Var.x.S()) / 1000;
                        sz0Var.O.U3();
                        org.telegram.ui.Components.dn0 seekBarWaveform = sz0Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = sz0Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.n;
                            if (r1Var != null) {
                                r1Var.invalidate();
                            }
                        }
                    }
                    if (sz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(nz0Var);
                        org.telegram.messenger.g0.h3(nz0Var, 16L);
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
                sz0 sz0Var2 = this.b;
                if (sz0Var2.d == null) {
                    org.telegram.messenger.g0.g3(new nz0(sz0Var2, 2));
                    org.telegram.ui.Cells.r1 r1Var2 = sz0Var2.P;
                    if (r1Var2 != null) {
                        r1Var2.setVisibility(0);
                        sz0Var2.P.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
