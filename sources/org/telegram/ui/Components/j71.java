package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class j71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vz vzVar = ((l71) this.b).b;
                if (vzVar != null) {
                    vzVar.e(false, true, false);
                    break;
                }
                break;
            case 1:
                v71 v71Var = (v71) this.b;
                i2.e0 e0Var = v71Var.d;
                if (e0Var != null) {
                    TextureView textureView = v71Var.n;
                    e0Var.B1();
                    if (textureView != null && textureView == e0Var.V) {
                        e0Var.B1();
                        e0Var.o1();
                        e0Var.t1(null);
                        e0Var.m1(0, 0);
                    }
                    v71Var.d.v1(v71Var.n);
                    ArrayList arrayList = v71Var.N;
                    if (arrayList != null) {
                        v71Var.F(arrayList, v71Var.O);
                    } else if (v71Var.U) {
                        v71Var.G(v71Var.Q, v71Var.S, v71Var.R, v71Var.T);
                    } else {
                        v71Var.D(v71Var.Q, v71Var.S);
                    }
                    v71Var.C();
                    break;
                }
                break;
            case 2:
                v71 v71Var2 = ((u71) this.b).f;
                v71Var2.a0.removeCallbacksAndMessages(null);
                v71Var2.K.onVisualizerUpdate(false, true, null);
                break;
            case 3:
                ((x71) this.b).g = false;
                break;
            case 4:
                ((r91) ((ki.c) ((org.telegram.ui.Cells.ga) this.b).b).b).v.b();
                break;
            default:
                ((n91) this.b).d(false, true);
                break;
        }
    }
}
