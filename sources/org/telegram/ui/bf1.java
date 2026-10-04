package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class bf1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf1 b;

    public /* synthetic */ bf1(yf1 yf1Var, int i10) {
        this.a = i10;
        this.b = yf1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        yf1 yf1Var;
        ah.i iVar;
        switch (this.a) {
            case 0:
                yf1 yf1Var2 = this.b;
                int L0 = yf1Var2.F.L0();
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
                    yf1Var2.G0(z10 || !yf1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar = (yf1Var = this.b).f1) != null) {
                    iVar.f(i10, i11);
                    yf1Var.x0();
                    break;
                }
                break;
        }
    }
}
