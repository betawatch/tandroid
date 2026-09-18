package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ d51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i51 i51Var = this.b;
                d51 d51Var = i51Var.Z;
                if (i51Var.w != null) {
                    i51Var.a0 = r2.n() / i51Var.w.p();
                    g51 g51Var = i51Var.N;
                    if (g51Var != null) {
                        g51Var.Xd = (i51Var.w.p() - i51Var.w.n()) / 1000;
                        i51Var.N.q4();
                        org.telegram.ui.Components.wo0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = i51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (i51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(d51Var);
                        AndroidUtilities.runOnUIThread(d51Var, 16L);
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
                i51 i51Var2 = this.b;
                if (i51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new d51(i51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = i51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        i51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
