package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class if1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ if1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        fg1 fg1Var;
        ah.i iVar;
        switch (this.a) {
            case 0:
                fg1 fg1Var2 = this.b;
                int L0 = fg1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 L = recyclerView.L(L0);
                    int top = L != null ? L.a.getTop() : 0;
                    if (L0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = L0 > 0;
                    }
                    fg1Var2.G0(z10 || !fg1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar = (fg1Var = this.b).f1) != null) {
                    iVar.f(i10, i11);
                    fg1Var.x0();
                    break;
                }
                break;
        }
    }
}
