package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements org.telegram.ui.ActionBar.r0, cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ c7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        m8 m8Var = this.b;
        if (!z10) {
            m8Var.getClass();
            return false;
        }
        if (m8Var.z0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        m8Var.I0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        switch (this.a) {
            case 0:
                m8 m8Var = this.b;
                m8Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = m8.Z0;
                    if (i10 < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i10]);
                        m8Var.L0(true);
                        break;
                    }
                }
                break;
            case 1:
                m8 m8Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = SharedConfig.playOrderReversed;
                    if ((z10 && i10 == 1) || (SharedConfig.shuffleMusic && i10 == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i10);
                    }
                    m8Var2.s.l();
                    if (z10 != SharedConfig.playOrderReversed) {
                        m8Var2.n.C0();
                        m8Var2.D0(false);
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
                m8Var2.N0();
                break;
            default:
                this.b.A0(i10);
                break;
        }
    }
}
