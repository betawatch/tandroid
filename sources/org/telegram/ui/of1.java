package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class of1 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg1 b;

    public /* synthetic */ of1(lg1 lg1Var, int i10) {
        this.a = i10;
        this.b = lg1Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        lg1 lg1Var;
        bh.f fVar;
        switch (this.a) {
            case 0:
                lg1 lg1Var2 = this.b;
                int L0 = lg1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    lg1Var2.G0(z10 || !lg1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (lg1Var = this.b).f1) != null) {
                    fVar.f(i10, i11);
                    lg1Var.x0();
                    break;
                }
                break;
        }
    }
}
