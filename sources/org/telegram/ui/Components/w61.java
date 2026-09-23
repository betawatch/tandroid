package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f71 f71Var = (f71) this.b;
                i2.f0 f0Var = f71Var.d;
                if (f0Var != null) {
                    TextureView textureView = f71Var.n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    f71Var.d.v1(f71Var.n);
                    ArrayList arrayList = f71Var.N;
                    if (arrayList != null) {
                        f71Var.F(arrayList, f71Var.O);
                    } else if (f71Var.U) {
                        f71Var.G(f71Var.Q, f71Var.S, f71Var.R, f71Var.T);
                    } else {
                        f71Var.D(f71Var.Q, f71Var.S);
                    }
                    f71Var.C();
                    break;
                }
                break;
            case 1:
                f71 f71Var2 = ((e71) this.b).f;
                f71Var2.a0.removeCallbacksAndMessages(null);
                f71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((h71) this.b).g = false;
                break;
            case 3:
                ((b91) ((k50) ((org.telegram.ui.Cells.ga) this.b).b).b).v.b();
                break;
            default:
                ((x81) this.b).d(false, true);
                break;
        }
    }
}
