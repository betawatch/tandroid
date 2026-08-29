package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.ui.ActionBar.s0, bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ y6(g8 g8Var, int i10) {
        this.a = i10;
        this.b = g8Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        g8 g8Var = this.b;
        if (!z10) {
            g8Var.getClass();
            return false;
        }
        if (g8Var.s0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        g8Var.B0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b;
                g8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = g8.Q0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        g8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                g8 g8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    g8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        g8Var2.n.B0();
                        g8Var2.w0(false);
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
                g8Var2.H0();
                break;
            default:
                this.b.t0(i10);
                break;
        }
    }
}
