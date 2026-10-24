package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements org.telegram.ui.ActionBar.q0, cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ a7(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        k8 k8Var = this.b;
        if (!z10) {
            k8Var.getClass();
            return false;
        }
        if (k8Var.z0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        k8Var.I0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
        switch (this.a) {
            case 0:
                k8 k8Var = this.b;
                k8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = k8.Z0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        k8Var.L0(true);
                        break;
                    }
                }
                break;
            case 1:
                k8 k8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    k8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        k8Var2.n.B0();
                        k8Var2.D0(false);
                    }
                } else if (i10 == 4) {
                    if (SharedConfig.repeatMode == 1) {
                        SharedConfig.setRepeatMode(0);
                    } else {
                        SharedConfig.setRepeatMode(1);
                    }
                } else if (SharedConfig.repeatMode == 2) {
                    SharedConfig.setRepeatMode(0);
                } else {
                    SharedConfig.setRepeatMode(2);
                }
                k8Var2.N0();
                break;
            default:
                this.b.A0(i10);
                break;
        }
    }
}
