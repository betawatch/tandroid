package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l51 b;

    public /* synthetic */ g51(l51 l51Var, int i10) {
        this.a = i10;
        this.b = l51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l51 l51Var = this.b;
                g51 g51Var = l51Var.Z;
                if (l51Var.w != null) {
                    l51Var.a0 = r2.n() / l51Var.w.p();
                    j51 j51Var = l51Var.N;
                    if (j51Var != null) {
                        j51Var.Xd = (l51Var.w.p() - l51Var.w.n()) / 1000;
                        l51Var.N.q4();
                        org.telegram.ui.Components.vo0 seekBarWaveform = l51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = l51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (l51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(g51Var);
                        AndroidUtilities.runOnUIThread(g51Var, 16L);
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
                l51 l51Var2 = this.b;
                if (l51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new g51(l51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = l51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        l51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
