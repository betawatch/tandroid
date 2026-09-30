package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xz xzVar = ((k71) this.b).b;
                if (xzVar != null) {
                    xzVar.e(false, true, false);
                    break;
                }
                break;
            case 1:
                u71 u71Var = (u71) this.b;
                i2.f0 f0Var = u71Var.d;
                if (f0Var != null) {
                    TextureView textureView = u71Var.n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    u71Var.d.v1(u71Var.n);
                    ArrayList arrayList = u71Var.N;
                    if (arrayList != null) {
                        u71Var.F(arrayList, u71Var.O);
                    } else if (u71Var.U) {
                        u71Var.G(u71Var.Q, u71Var.S, u71Var.R, u71Var.T);
                    } else {
                        u71Var.D(u71Var.Q, u71Var.S);
                    }
                    u71Var.C();
                    break;
                }
                break;
            case 2:
                u71 u71Var2 = ((t71) this.b).f;
                u71Var2.a0.removeCallbacksAndMessages(null);
                u71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 3:
                ((w71) this.b).g = false;
                break;
            case 4:
                ((q91) ((ki.d) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((m91) this.b).d(false, true);
                break;
        }
    }
}
