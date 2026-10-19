package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class t71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b81 b81Var = (b81) this.b;
                i2.i0 i0Var = b81Var.d;
                if (i0Var != null) {
                    TextureView textureView = b81Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    b81Var.d.z1(b81Var.n);
                    ArrayList arrayList = b81Var.N;
                    if (arrayList != null) {
                        b81Var.F(arrayList, b81Var.O);
                    } else if (b81Var.U) {
                        b81Var.G(b81Var.Q, b81Var.S, b81Var.R, b81Var.T);
                    } else {
                        b81Var.D(b81Var.Q, b81Var.S);
                    }
                    b81Var.C();
                    break;
                }
                break;
            case 1:
                b81 b81Var2 = ((a81) this.b).f;
                b81Var2.a0.removeCallbacksAndMessages(null);
                b81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((d81) this.b).g = false;
                break;
            case 3:
                ((v91) ((t50) ((org.telegram.ui.Cells.ca) this.b).b).b).v.b();
                break;
            default:
                ((r91) this.b).d(false, true);
                break;
        }
    }
}
