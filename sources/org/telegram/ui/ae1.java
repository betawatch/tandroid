package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ae1 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye1 b;

    public /* synthetic */ ae1(ye1 ye1Var, int i10) {
        this.a = i10;
        this.b = ye1Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ye1 ye1Var;
        bh.f fVar;
        switch (this.a) {
            case 0:
                ye1 ye1Var2 = this.b;
                int L0 = ye1Var2.F.L0();
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
                    ye1Var2.F0(z10 || !ye1Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.x0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (ye1Var = this.b).g1) != null) {
                    fVar.f(i10, i11);
                    ye1Var.w0();
                    break;
                }
                break;
        }
    }
}
