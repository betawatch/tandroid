package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wz wzVar = ((i71) this.b).b;
                if (wzVar != null) {
                    wzVar.e(false, true, false);
                    break;
                }
                break;
            case 1:
                s71 s71Var = (s71) this.b;
                i2.f0 f0Var = s71Var.d;
                if (f0Var != null) {
                    TextureView textureView = s71Var.n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    s71Var.d.v1(s71Var.n);
                    ArrayList arrayList = s71Var.N;
                    if (arrayList != null) {
                        s71Var.F(arrayList, s71Var.O);
                    } else if (s71Var.U) {
                        s71Var.G(s71Var.Q, s71Var.S, s71Var.R, s71Var.T);
                    } else {
                        s71Var.D(s71Var.Q, s71Var.S);
                    }
                    s71Var.C();
                    break;
                }
                break;
            case 2:
                s71 s71Var2 = ((r71) this.b).f;
                s71Var2.a0.removeCallbacksAndMessages(null);
                s71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 3:
                ((u71) this.b).g = false;
                break;
            case 4:
                ((o91) ((ki.c) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((k91) this.b).d(false, true);
                break;
        }
    }
}
