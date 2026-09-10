package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t71 t71Var = (t71) this.b;
                i2.e0 e0Var = t71Var.d;
                if (e0Var != null) {
                    TextureView textureView = t71Var.n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    t71Var.d.v1(t71Var.n);
                    ArrayList arrayList = t71Var.N;
                    if (arrayList != null) {
                        t71Var.F(arrayList, t71Var.O);
                    } else if (t71Var.U) {
                        t71Var.G(t71Var.Q, t71Var.S, t71Var.R, t71Var.T);
                    } else {
                        t71Var.D(t71Var.Q, t71Var.S);
                    }
                    t71Var.C();
                    break;
                }
                break;
            case 1:
                t71 t71Var2 = ((s71) this.b).f;
                t71Var2.a0.removeCallbacksAndMessages(null);
                t71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((v71) this.b).g = false;
                break;
            case 3:
                ((o91) ((t50) ((org.telegram.ui.Cells.ha) this.b).b).b).v.b();
                break;
            default:
                ((k91) this.b).d(false, true);
                break;
        }
    }
}
