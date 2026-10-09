package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements org.telegram.ui.ActionBar.r0, gm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ b7(l8 l8Var, int i10) {
        this.a = i10;
        this.b = l8Var;
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        l8 l8Var = this.b;
        if (!z10) {
            l8Var.getClass();
            return false;
        }
        if (l8Var.t0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        l8Var.C0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        switch (this.a) {
            case 0:
                l8 l8Var = this.b;
                l8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = l8.U0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        l8Var.F0(true);
                        break;
                    }
                }
                break;
            case 1:
                l8 l8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    l8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        l8Var2.n.B0();
                        l8Var2.x0(false);
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
                l8Var2.H0();
                break;
            default:
                this.b.u0(i10);
                break;
        }
    }
}
