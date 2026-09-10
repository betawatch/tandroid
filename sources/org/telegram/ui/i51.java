package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n51 b;

    public /* synthetic */ i51(n51 n51Var, int i10) {
        this.a = i10;
        this.b = n51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n51 n51Var = this.b;
                i51 i51Var = n51Var.Z;
                if (n51Var.w != null) {
                    n51Var.a0 = r2.n() / n51Var.w.p();
                    l51 l51Var = n51Var.N;
                    if (l51Var != null) {
                        l51Var.Xd = (n51Var.w.p() - n51Var.w.n()) / 1000;
                        n51Var.N.q4();
                        org.telegram.ui.Components.ro0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = n51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (n51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(i51Var);
                        AndroidUtilities.runOnUIThread(i51Var, 16L);
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
                n51 n51Var2 = this.b;
                if (n51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new i51(n51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = n51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        n51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
