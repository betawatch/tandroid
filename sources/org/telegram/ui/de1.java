package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class de1 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ af1 b;

    public /* synthetic */ de1(af1 af1Var, int i10) {
        this.a = i10;
        this.b = af1Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        af1 af1Var;
        ch.f fVar;
        switch (this.a) {
            case 0:
                af1 af1Var2 = this.b;
                int L0 = af1Var2.F.L0();
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
                    af1Var2.G0(z10 || !af1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (af1Var = this.b).g1) != null) {
                    fVar.f(i10, i11);
                    af1Var.x0();
                    break;
                }
                break;
        }
    }
}
