package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.ui.ActionBar.r0, ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ y6(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        i8 i8Var = this.b;
        if (!z10) {
            i8Var.getClass();
            return false;
        }
        if (i8Var.s0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        i8Var.B0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                i8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = i8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        i8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                i8 i8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    i8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        i8Var2.n.C0();
                        i8Var2.w0(false);
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
                i8Var2.H0();
                break;
            default:
                this.b.t0(i10);
                break;
        }
    }
}
