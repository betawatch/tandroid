package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u71 u71Var = (u71) this.b;
                i2.e0 e0Var = u71Var.d;
                if (e0Var != null) {
                    TextureView textureView = u71Var.n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
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
            case 1:
                u71 u71Var2 = ((t71) this.b).f;
                u71Var2.a0.removeCallbacksAndMessages(null);
                u71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((w71) this.b).g = false;
                break;
            case 3:
                ((q91) ((ki.c) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((m91) this.b).d(false, true);
                break;
        }
    }
}
