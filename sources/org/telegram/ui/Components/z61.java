package org.telegram.ui.Components;

import android.view.TextureView;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i71 i71Var = (i71) this.b;
                j3.f0 f0Var = i71Var.d;
                if (f0Var != null) {
                    TextureView textureView = i71Var.n;
                    f0Var.j0();
                    if (textureView != null && textureView == f0Var.T) {
                        f0Var.j0();
                        f0Var.U();
                        f0Var.Z(null);
                        f0Var.T(0, 0);
                    }
                    i71Var.d.c0(i71Var.n);
                    ArrayList arrayList = i71Var.K;
                    if (arrayList != null) {
                        i71Var.F(arrayList, i71Var.L);
                    } else if (i71Var.R) {
                        i71Var.G(i71Var.N, i71Var.P, i71Var.O, i71Var.Q);
                    } else {
                        i71Var.D(i71Var.N, i71Var.P);
                    }
                    i71Var.C();
                    break;
                }
                break;
            case 1:
                i71 i71Var2 = ((h71) this.b).f;
                i71Var2.X.removeCallbacksAndMessages(null);
                i71Var2.H.onVisualizerUpdate(false, true, null);
                break;
            case 2:
                ((k71) this.b).g = false;
                break;
            case 3:
                ((e91) ((ih.h) ((org.telegram.ui.Cells.aa) this.b).b).b).v.b();
                break;
            default:
                ((a91) this.b).d(false, true);
                break;
        }
    }
}
