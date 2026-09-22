package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g71 g71Var = (g71) this.b;
                i2.e0 e0Var = g71Var.d;
                if (e0Var != null) {
                    TextureView textureView = g71Var.n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    g71Var.d.v1(g71Var.n);
                    ArrayList arrayList = g71Var.N;
                    if (arrayList != null) {
                        g71Var.F(arrayList, g71Var.O);
                    } else if (g71Var.U) {
                        g71Var.G(g71Var.Q, g71Var.S, g71Var.R, g71Var.T);
                    } else {
                        g71Var.D(g71Var.Q, g71Var.S);
                    }
                    g71Var.C();
                    break;
                }
                break;
            case 1:
                g71 g71Var2 = ((f71) this.b).f;
                g71Var2.a0.removeCallbacksAndMessages(null);
                g71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((i71) this.b).g = false;
                break;
            case 3:
                ((c91) ((j50) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((y81) this.b).d(false, true);
                break;
        }
    }
}
