package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p41 b;

    public /* synthetic */ k41(p41 p41Var, int i10) {
        this.a = i10;
        this.b = p41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p41 p41Var = this.b;
                k41 k41Var = p41Var.W;
                if (p41Var.w != null) {
                    p41Var.X = r2.n() / p41Var.w.p();
                    n41 n41Var = p41Var.K;
                    if (n41Var != null) {
                        n41Var.Ud = (p41Var.w.p() - p41Var.w.n()) / 1000;
                        p41Var.K.q4();
                        org.telegram.ui.Components.mo0 seekBarWaveform = p41Var.K.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = p41Var.X;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (p41Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(k41Var);
                        AndroidUtilities.runOnUIThread(k41Var, 16L);
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
                p41 p41Var2 = this.b;
                if (p41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new k41(p41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = p41Var2.L;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        p41Var2.L.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
