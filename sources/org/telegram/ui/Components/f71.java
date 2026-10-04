package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class f71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((g71) this.b).invalidateSelf();
                break;
            case 1:
                yz yzVar = ((t71) this.b).b;
                if (yzVar != null) {
                    yzVar.e(false, true, false);
                    break;
                }
                break;
            case 2:
                d81 d81Var = (d81) this.b;
                i2.f0 f0Var = d81Var.d;
                if (f0Var != null) {
                    TextureView textureView = d81Var.n;
                    f0Var.B1();
                    if (textureView != null && textureView == f0Var.V) {
                        f0Var.B1();
                        f0Var.o1();
                        f0Var.t1(null);
                        f0Var.m1(0, 0);
                    }
                    d81Var.d.v1(d81Var.n);
                    ArrayList arrayList = d81Var.N;
                    if (arrayList != null) {
                        d81Var.F(arrayList, d81Var.O);
                    } else if (d81Var.U) {
                        d81Var.G(d81Var.Q, d81Var.S, d81Var.R, d81Var.T);
                    } else {
                        d81Var.D(d81Var.Q, d81Var.S);
                    }
                    d81Var.C();
                    break;
                }
                break;
            case 3:
                d81 d81Var2 = ((c81) this.b).f;
                d81Var2.a0.removeCallbacksAndMessages(null);
                d81Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 4:
                ((f81) this.b).g = false;
                break;
            case 5:
                ((z91) ((ki.d) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((v91) this.b).d(false, true);
                break;
        }
    }
}
