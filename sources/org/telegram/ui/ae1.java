package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ae1 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze1 b;

    public /* synthetic */ ae1(ze1 ze1Var, int i10) {
        this.a = i10;
        this.b = ze1Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ze1 ze1Var;
        lg.e eVar;
        switch (this.a) {
            case 0:
                ze1 ze1Var2 = this.b;
                int L0 = ze1Var2.B.L0();
                if (L0 != -1) {
                    f2.n1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    ze1Var2.G0(z10 || !ze1Var2.G, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (ze1Var = this.b).b1) != null) {
                    eVar.f(i10, i11);
                    ze1Var.x0();
                    break;
                }
                break;
        }
    }
}
