package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ f51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k51 k51Var = this.b;
                f51 f51Var = k51Var.Z;
                if (k51Var.w != null) {
                    k51Var.a0 = r2.n() / k51Var.w.p();
                    i51 i51Var = k51Var.N;
                    if (i51Var != null) {
                        i51Var.Xd = (k51Var.w.p() - k51Var.w.n()) / 1000;
                        k51Var.N.q4();
                        org.telegram.ui.Components.io0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = k51Var.a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (k51Var.w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(f51Var);
                        AndroidUtilities.runOnUIThread(f51Var, 16L);
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
                k51 k51Var2 = this.b;
                if (k51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new f51(k51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = k51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        k51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
