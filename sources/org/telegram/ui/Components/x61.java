package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                i2.f0 f0Var = g71Var.d;
                if (f0Var != null) {
                    TextureView textureView = g71Var.n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
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
                ((b91) ((j50) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((x81) this.b).d(false, true);
                break;
        }
    }
}
