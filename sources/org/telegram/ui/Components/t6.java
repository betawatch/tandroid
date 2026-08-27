package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements org.telegram.ui.ActionBar.r0, rk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ t6(b8 b8Var, int i10) {
        this.a = i10;
        this.b = b8Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        b8 b8Var = this.b;
        if (!z10) {
            b8Var.getClass();
            return false;
        }
        if (b8Var.s0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        b8Var.B0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                b8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = b8.Q0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        b8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                b8 b8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    b8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        b8Var2.n.B0();
                        b8Var2.w0(false);
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
                b8Var2.H0();
                break;
            default:
                this.b.t0(i10);
                break;
        }
    }
}
