package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fe1 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf1 b;

    public /* synthetic */ fe1(cf1 cf1Var, int i10) {
        this.a = i10;
        this.b = cf1Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        cf1 cf1Var;
        ch.f fVar;
        switch (this.a) {
            case 0:
                cf1 cf1Var2 = this.b;
                int L0 = cf1Var2.F.L0();
                if (L0 != -1) {
                    s4.e1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    cf1Var2.G0(z10 || !cf1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (cf1Var = this.b).g1) != null) {
                    fVar.f(i10, i11);
                    cf1Var.x0();
                    break;
                }
                break;
        }
    }
}
