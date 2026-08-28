package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b61(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k61 k61Var = (k61) this.b;
                h3.k0 k0Var = k61Var.d;
                if (k0Var != null) {
                    TextureView textureView = k61Var.n;
                    k0Var.q0();
                    if (textureView != null && textureView == k0Var.V) {
                        k0Var.q0();
                        k0Var.b0();
                        k0Var.g0(null);
                        k0Var.a0(0, 0);
                    }
                    k61Var.d.j0(k61Var.n);
                    ArrayList arrayList = k61Var.J;
                    if (arrayList != null) {
                        k61Var.G(arrayList, k61Var.K);
                    } else if (k61Var.Q) {
                        k61Var.H(k61Var.M, k61Var.O, k61Var.N, k61Var.P);
                    } else {
                        k61Var.E(k61Var.M, k61Var.O);
                    }
                    k61Var.D();
                    break;
                }
                break;
            case 1:
                k61 k61Var2 = ((j61) this.b).f;
                k61Var2.W.removeCallbacksAndMessages(null);
                k61Var2.G.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((m61) this.b).g = false;
                break;
            case 3:
                ((g81) ((dh.i) ((org.telegram.ui.Cells.ca) this.b).b).b).v.b();
                break;
            default:
                ((c81) this.b).d(false, true);
                break;
        }
    }
}
