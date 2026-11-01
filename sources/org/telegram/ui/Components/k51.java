package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k51(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                UndoView undoView = (UndoView) obj;
                int i11 = UndoView.i0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((y51) obj).invalidateSelf();
                break;
            case 2:
                gz gzVar = ((l61) obj).b;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    break;
                }
                break;
            case 3:
                v61 v61Var = (v61) obj;
                i2.i0 i0Var = v61Var.d;
                if (i0Var != null) {
                    TextureView textureView = v61Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    v61Var.d.z1(v61Var.n);
                    ArrayList arrayList = v61Var.N;
                    if (arrayList != null) {
                        v61Var.k0(arrayList, v61Var.O);
                    } else if (v61Var.U) {
                        v61Var.l0(v61Var.Q, v61Var.S, v61Var.R, v61Var.T);
                    } else {
                        v61Var.j0(v61Var.Q, v61Var.S);
                    }
                    v61Var.h0();
                    break;
                }
                break;
            case 4:
                v61 v61Var2 = (v61) ((bi.r6) obj).f;
                v61Var2.a0.removeCallbacksAndMessages(null);
                v61Var2.K.B(false, null);
                break;
            case 5:
                ((x61) obj).g = false;
                break;
            case 6:
                ((n81) ((li.e) ((org.telegram.ui.ActionBar.l1) obj).b).b).w.b();
                break;
            default:
                ((j81) obj).d(false, true);
                break;
        }
    }
}
