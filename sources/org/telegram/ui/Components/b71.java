package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k71 k71Var = (k71) this.b;
                j3.f0 f0Var = k71Var.d;
                if (f0Var != null) {
                    TextureView textureView = k71Var.n;
                    f0Var.j0();
                    if (textureView != null && textureView == f0Var.T) {
                        f0Var.j0();
                        f0Var.U();
                        f0Var.Z(null);
                        f0Var.T(0, 0);
                    }
                    k71Var.d.c0(k71Var.n);
                    ArrayList arrayList = k71Var.K;
                    if (arrayList != null) {
                        k71Var.F(arrayList, k71Var.L);
                    } else if (k71Var.R) {
                        k71Var.G(k71Var.N, k71Var.P, k71Var.O, k71Var.Q);
                    } else {
                        k71Var.D(k71Var.N, k71Var.P);
                    }
                    k71Var.C();
                    break;
                }
                break;
            case 1:
                k71 k71Var2 = ((j71) this.b).f;
                k71Var2.X.removeCallbacksAndMessages(null);
                k71Var2.H.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((m71) this.b).g = false;
                break;
            case 3:
                ((f91) ((jh.h) ((org.telegram.ui.Cells.ba) this.b).b).b).v.b();
                break;
            default:
                ((b91) this.b).d(false, true);
                break;
        }
    }
}
