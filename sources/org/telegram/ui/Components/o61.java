package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x61 x61Var = (x61) this.b;
                j3.k0 k0Var = x61Var.d;
                if (k0Var != null) {
                    TextureView textureView = x61Var.n;
                    k0Var.q0();
                    if (textureView != null && textureView == k0Var.V) {
                        k0Var.q0();
                        k0Var.b0();
                        k0Var.g0(null);
                        k0Var.a0(0, 0);
                    }
                    x61Var.d.j0(x61Var.n);
                    ArrayList arrayList = x61Var.J;
                    if (arrayList != null) {
                        x61Var.G(arrayList, x61Var.K);
                    } else if (x61Var.Q) {
                        x61Var.H(x61Var.M, x61Var.O, x61Var.N, x61Var.P);
                    } else {
                        x61Var.E(x61Var.M, x61Var.O);
                    }
                    x61Var.D();
                    break;
                }
                break;
            case 1:
                x61 x61Var2 = ((w61) this.b).f;
                x61Var2.W.removeCallbacksAndMessages(null);
                x61Var2.G.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((z61) this.b).g = false;
                break;
            case 3:
                ((s81) ((gh.h) ((org.telegram.ui.Cells.z9) this.b).b).b).v.b();
                break;
            default:
                ((o81) this.b).d(false, true);
                break;
        }
    }
}
