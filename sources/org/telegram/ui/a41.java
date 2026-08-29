package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                a41 a41Var = f41Var.V;
                if (f41Var.w != null) {
                    f41Var.W = r2.o() / f41Var.w.q();
                    d41 d41Var = f41Var.J;
                    if (d41Var != null) {
                        d41Var.Td = (f41Var.w.q() - f41Var.w.o()) / 1000;
                        f41Var.J.q4();
                        org.telegram.ui.Components.co0 seekBarWaveform = f41Var.J.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f9 = f41Var.W;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f9;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (f41Var.w.z()) {
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
                    org.telegram.ui.Cells.s1 s1Var2 = f41Var2.K;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        f41Var2.K.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
