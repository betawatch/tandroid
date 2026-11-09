package org.telegram.ui;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                pz0 pz0Var = uz0Var.Z;
                if (uz0Var.x != null) {
                    uz0Var.a0 = r2.S() / uz0Var.x.U();
                    sz0 sz0Var = uz0Var.N;
                    if (sz0Var != null) {
                        sz0Var.oc = (uz0Var.x.U() - uz0Var.x.S()) / 1000;
                        uz0Var.N.S3();
                        org.telegram.ui.Components.qm0 seekBarWaveform = uz0Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = uz0Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (uz0Var.x.d0()) {
                        org.telegram.messenger.g0.r(pz0Var);
                        org.telegram.messenger.g0.i3(pz0Var, 16L);
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
                    org.telegram.messenger.g0.h3(new pz0(uz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = uz0Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        uz0Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                break;
        }
    }
}
