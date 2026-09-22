package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements org.telegram.ui.ActionBar.r0, bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ x6(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        h8 h8Var = this.b;
        if (!z10) {
            h8Var.getClass();
            return false;
        }
        if (h8Var.s0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        h8Var.B0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                h8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = h8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        h8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                h8 h8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    h8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        h8Var2.n.B0();
                        h8Var2.w0(false);
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
                h8Var2.H0();
                break;
            default:
                this.b.t0(i10);
                break;
        }
    }
}
