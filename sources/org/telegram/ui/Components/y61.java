package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h71 h71Var = (h71) this.b;
                i2.e0 e0Var = h71Var.d;
                if (e0Var != null) {
                    TextureView textureView = h71Var.n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    h71Var.d.v1(h71Var.n);
                    ArrayList arrayList = h71Var.N;
                    if (arrayList != null) {
                        h71Var.F(arrayList, h71Var.O);
                    } else if (h71Var.U) {
                        h71Var.G(h71Var.Q, h71Var.S, h71Var.R, h71Var.T);
                    } else {
                        h71Var.D(h71Var.Q, h71Var.S);
                    }
                    h71Var.C();
                    break;
                }
                break;
            case 1:
                h71 h71Var2 = ((g71) this.b).f;
                h71Var2.a0.removeCallbacksAndMessages(null);
                h71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((j71) this.b).g = false;
                break;
            case 3:
                ((d91) ((j50) ((org.telegram.ui.Cells.fa) this.b).b).b).v.b();
                break;
            default:
                ((z81) this.b).d(false, true);
                break;
        }
    }
}
