package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ m51(r51 r51Var, int i10) {
        this.a = i10;
        this.b = r51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r51 r51Var = this.b;
                m51 m51Var = r51Var.Z;
                if (r51Var.w != null) {
                    r51Var.a0 = r2.n() / r51Var.w.p();
                    p51 p51Var = r51Var.N;
                    if (p51Var != null) {
                        p51Var.Xd = (r51Var.w.p() - r51Var.w.n()) / 1000;
                        r51Var.N.q4();
                        org.telegram.ui.Components.jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = r51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (r51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m51Var);
                        AndroidUtilities.runOnUIThread(m51Var, 16L);
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
                r51 r51Var2 = this.b;
                if (r51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new m51(r51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = r51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        r51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
