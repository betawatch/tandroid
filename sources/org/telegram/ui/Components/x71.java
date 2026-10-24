package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class x71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e00 e00Var = ((z71) this.b).b;
                if (e00Var != null) {
                    e00Var.d(false, true, false);
                    break;
                }
                break;
            case 1:
                j81 j81Var = (j81) this.b;
                i2.h0 h0Var = j81Var.d;
                if (h0Var != null) {
                    TextureView textureView = j81Var.n;
                    h0Var.F1();
                    if (textureView != null && textureView == h0Var.X) {
                        h0Var.F1();
                        h0Var.s1();
                        h0Var.x1(null);
                        h0Var.q1(0, 0);
                    }
                    j81Var.d.z1(j81Var.n);
                    ArrayList arrayList = j81Var.N;
                    if (arrayList != null) {
                        j81Var.F(arrayList, j81Var.O);
                    } else if (j81Var.U) {
                        j81Var.G(j81Var.Q, j81Var.S, j81Var.R, j81Var.T);
                    } else {
                        j81Var.D(j81Var.Q, j81Var.S);
                    }
                    j81Var.C();
                    break;
                }
                break;
            case 2:
                j81 j81Var2 = ((i81) this.b).f;
                j81Var2.a0.removeCallbacksAndMessages(null);
                j81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 3:
                ((l81) this.b).g = false;
                break;
            case 4:
                ((da1) ((t50) ((org.telegram.ui.Cells.da) this.b).b).b).v.b();
                break;
            default:
                ((z91) this.b).d(false, true);
                break;
        }
    }
}
