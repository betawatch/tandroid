package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements org.telegram.ui.ActionBar.s0, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ u6(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.x;
        c8 c8Var = this.b;
        if (!z4) {
            c8Var.getClass();
            return false;
        }
        if (c8Var.s0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        c8Var.B0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = c8.R0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        c8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                c8 c8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z4 = SharedConfig.playOrderReversed;
                    if ((z4 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    c8Var2.s.l();
                    if (z4 != SharedConfig.playOrderReversed) {
                        c8Var2.n.B0();
                        c8Var2.w0(false);
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
                c8Var2.H0();
                break;
            default:
                this.b.t0(i10);
                break;
        }
    }
}
