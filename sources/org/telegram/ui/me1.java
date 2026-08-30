package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class me1 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf1 b;

    public /* synthetic */ me1(kf1 kf1Var, int i10) {
        this.a = i10;
        this.b = kf1Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        kf1 kf1Var;
        ng.e eVar;
        switch (this.a) {
            case 0:
                kf1 kf1Var2 = this.b;
                int L0 = kf1Var2.C.L0();
                if (L0 != -1) {
                    f2.l1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z4 = top < 0;
                        Math.abs(i12);
                    } else {
                        z4 = L0 > 0;
                    }
                    kf1Var2.G0(z4 || !kf1Var2.H, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (kf1Var = this.b).c1) != null) {
                    eVar.f(i10, i11);
                    kf1Var.x0();
                    break;
                }
                break;
        }
    }
}
