package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ m41(r41 r41Var, int i10) {
        this.a = i10;
        this.b = r41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r41 r41Var = this.b;
                m41 m41Var = r41Var.W;
                if (r41Var.w != null) {
                    r41Var.X = r2.n() / r41Var.w.p();
                    p41 p41Var = r41Var.K;
                    if (p41Var != null) {
                        p41Var.Ud = (r41Var.w.p() - r41Var.w.n()) / 1000;
                        r41Var.K.q4();
                        org.telegram.ui.Components.no0 seekBarWaveform = r41Var.K.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = r41Var.X;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (r41Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m41Var);
                        AndroidUtilities.runOnUIThread(m41Var, 16L);
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
                r41 r41Var2 = this.b;
                if (r41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new m41(r41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = r41Var2.L;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        r41Var2.L.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
