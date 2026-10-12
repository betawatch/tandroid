package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class v71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h00 h00Var = ((x71) this.b).b;
                if (h00Var != null) {
                    h00Var.d(false, true, false);
                    break;
                }
                break;
            case 1:
                h81 h81Var = (h81) this.b;
                i2.h0 h0Var = h81Var.d;
                if (h0Var != null) {
                    TextureView textureView = h81Var.n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    h81Var.d.z1(h81Var.n);
                    ArrayList arrayList = h81Var.N;
                    if (arrayList != null) {
                        h81Var.F(arrayList, h81Var.O);
                    } else if (h81Var.U) {
                        h81Var.G(h81Var.Q, h81Var.S, h81Var.R, h81Var.T);
                    } else {
                        h81Var.D(h81Var.Q, h81Var.S);
                    }
                    h81Var.C();
                    break;
                }
                break;
            case 2:
                h81 h81Var2 = ((g81) this.b).f;
                h81Var2.a0.removeCallbacksAndMessages(null);
                h81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 3:
                ((j81) this.b).g = false;
                break;
            case 4:
                ((ca1) ((li.e) ((org.telegram.ui.Cells.da) this.b).b).b).v.b();
                break;
            default:
                ((y91) this.b).d(false, true);
                break;
        }
    }
}
