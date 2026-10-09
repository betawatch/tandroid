package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k81 k81Var = (k81) this.b;
                i2.f0 f0Var = k81Var.d;
                if (f0Var != null) {
                    TextureView textureView = k81Var.n;
                    f0Var.D1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.D1();
                        f0Var.q1();
                        f0Var.v1(null);
                        f0Var.o1(0, 0);
                    }
                    k81Var.d.x1(k81Var.n);
                    ArrayList arrayList = k81Var.N;
                    if (arrayList != null) {
                        k81Var.F(arrayList, k81Var.O);
                    } else if (k81Var.U) {
                        k81Var.G(k81Var.Q, k81Var.S, k81Var.R, k81Var.T);
                    } else {
                        k81Var.D(k81Var.Q, k81Var.S);
                    }
                    k81Var.C();
                    break;
                }
                break;
            case 1:
                k81 k81Var2 = ((j81) this.b).f;
                k81Var2.a0.removeCallbacksAndMessages(null);
                k81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((m81) this.b).g = false;
                break;
            case 3:
                ((ha1) ((ki.d) ((org.telegram.ui.Cells.da) this.b).b).b).v.b();
                break;
            default:
                ((ca1) this.b).d(false, true);
                break;
        }
    }
}
