package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a81 a81Var = (a81) this.b;
                i2.g0 g0Var = a81Var.d;
                if (g0Var != null) {
                    TextureView textureView = a81Var.n;
                    g0Var.F1();
                    if (textureView != null && textureView == g0Var.X) {
                        g0Var.F1();
                        g0Var.s1();
                        g0Var.x1(null);
                        g0Var.q1(0, 0);
                    }
                    a81Var.d.z1(a81Var.n);
                    ArrayList arrayList = a81Var.N;
                    if (arrayList != null) {
                        a81Var.F(arrayList, a81Var.O);
                    } else if (a81Var.U) {
                        a81Var.G(a81Var.Q, a81Var.S, a81Var.R, a81Var.T);
                    } else {
                        a81Var.D(a81Var.Q, a81Var.S);
                    }
                    a81Var.C();
                    break;
                }
                break;
            case 1:
                a81 a81Var2 = ((z71) this.b).f;
                a81Var2.a0.removeCallbacksAndMessages(null);
                a81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((c81) this.b).g = false;
                break;
            case 3:
                ((u91) ((t50) ((org.telegram.ui.Cells.ca) this.b).b).b).v.b();
                break;
            default:
                ((q91) this.b).d(false, true);
                break;
        }
    }
}
