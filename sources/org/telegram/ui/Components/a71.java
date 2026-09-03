package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a71(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j71 j71Var = (j71) this.b;
                j3.f0 f0Var = j71Var.d;
                if (f0Var != null) {
                    TextureView textureView = j71Var.n;
                    f0Var.j0();
                    if (textureView != null && textureView == f0Var.T) {
                        f0Var.j0();
                        f0Var.U();
                        f0Var.Z(null);
                        f0Var.T(0, 0);
                    }
                    j71Var.d.c0(j71Var.n);
                    ArrayList arrayList = j71Var.K;
                    if (arrayList != null) {
                        j71Var.F(arrayList, j71Var.L);
                    } else if (j71Var.R) {
                        j71Var.G(j71Var.N, j71Var.P, j71Var.O, j71Var.Q);
                    } else {
                        j71Var.D(j71Var.N, j71Var.P);
                    }
                    j71Var.C();
                    break;
                }
                break;
            case 1:
                j71 j71Var2 = ((i71) this.b).f;
                j71Var2.X.removeCallbacksAndMessages(null);
                j71Var2.H.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((l71) this.b).g = false;
                break;
            case 3:
                ((e91) ((jh.h) ((org.telegram.ui.Cells.ba) this.b).b).b).v.b();
                break;
            default:
                ((a91) this.b).d(false, true);
                break;
        }
    }
}
