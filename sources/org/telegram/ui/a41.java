package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ a41(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f41 f41Var = this.b;
                a41 a41Var = f41Var.Z;
                if (f41Var.w != null) {
                    f41Var.a0 = r2.n() / f41Var.w.p();
                    d41 d41Var = f41Var.N;
                    if (d41Var != null) {
                        d41Var.Yd = (f41Var.w.p() - f41Var.w.n()) / 1000;
                        f41Var.N.s4();
                        org.telegram.ui.Components.qp0 seekBarWaveform = f41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = f41Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (f41Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(a41Var);
                        AndroidUtilities.runOnUIThread(a41Var, 16L);
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
                f41 f41Var2 = this.b;
                if (f41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new a41(f41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = f41Var2.O;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        f41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
