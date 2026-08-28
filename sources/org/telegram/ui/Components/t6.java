package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements org.telegram.ui.ActionBar.s0, ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ t6(c8 c8Var, int i9) {
        this.a = i9;
        this.b = c8Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x;
        c8 c8Var = this.b;
        if (!z10) {
            c8Var.getClass();
            return false;
        }
        if (c8Var.r0()) {
            return false;
        }
        org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
        c8Var.A0(xVar, xVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        switch (this.a) {
            case 0:
                c8 c8Var = this.b;
                c8Var.getClass();
                if (i9 >= 0) {
                    float[] fArr = c8.Q0;
                    if (i9 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i9]);
                        c8Var.E0(true);
                        break;
                    }
                }
                break;
            case 1:
                c8 c8Var2 = this.b;
                if (i9 == 1 || i9 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i9 == 1) || (SharedConfig.shuffleMusic && i9 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i9);
                    }
                    c8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        c8Var2.n.B0();
                        c8Var2.v0(false);
                    }
                } else if (i9 == 4) {
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
                c8Var2.G0();
                break;
            default:
                this.b.s0(i9);
                break;
        }
    }
}
