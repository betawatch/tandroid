package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lf1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig1 b;

    public /* synthetic */ lf1(ig1 ig1Var, int i10) {
        this.a = i10;
        this.b = ig1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ig1 ig1Var;
        zg.e eVar;
        switch (this.a) {
            case 0:
                ig1 ig1Var2 = this.b;
                int L0 = ig1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    ig1Var2.G0(z10 || !ig1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (ig1Var = this.b).f1) != null) {
                    eVar.f(i10, i11);
                    ig1Var.x0();
                    break;
                }
                break;
        }
    }
}
