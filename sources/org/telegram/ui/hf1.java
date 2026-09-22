package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hf1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg1 b;

    public /* synthetic */ hf1(eg1 eg1Var, int i10) {
        this.a = i10;
        this.b = eg1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        eg1 eg1Var;
        ah.h hVar;
        switch (this.a) {
            case 0:
                eg1 eg1Var2 = this.b;
                int L0 = eg1Var2.F.L0();
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
                    eg1Var2.G0(z10 || !eg1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (eg1Var = this.b).f1) != null) {
                    hVar.f(i10, i11);
                    eg1Var.x0();
                    break;
                }
                break;
        }
    }
}
