package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j51(Object obj, int i10) {
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
                ((x51) obj).invalidateSelf();
                break;
            case 2:
                gz gzVar = ((k61) obj).b;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    break;
                }
                break;
            case 3:
                u61 u61Var = (u61) obj;
                i2.i0 i0Var = u61Var.d;
                if (i0Var != null) {
                    TextureView textureView = u61Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    u61Var.d.z1(u61Var.n);
                    ArrayList arrayList = u61Var.N;
                    if (arrayList != null) {
                        u61Var.k0(arrayList, u61Var.O);
                    } else if (u61Var.U) {
                        u61Var.l0(u61Var.Q, u61Var.S, u61Var.R, u61Var.T);
                    } else {
                        u61Var.j0(u61Var.Q, u61Var.S);
                    }
                    u61Var.h0();
                    break;
                }
                break;
            case 4:
                u61 u61Var2 = (u61) ((bi.r6) obj).f;
                u61Var2.a0.removeCallbacksAndMessages(null);
                u61Var2.K.B(false, null);
                break;
            case 5:
                ((w61) obj).g = false;
                break;
            case 6:
                ((m81) ((li.e) ((org.telegram.ui.ActionBar.l1) obj).b).b).w.b();
                break;
            default:
                ((i81) obj).d(false, true);
                break;
        }
    }
}
