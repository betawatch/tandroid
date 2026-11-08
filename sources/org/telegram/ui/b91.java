package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b91 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w91 b;

    public /* synthetic */ b91(w91 w91Var, int i7) {
        this.a = i7;
        this.b = w91Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        w91 w91Var;
        dh.g gVar;
        switch (this.a) {
            case 0:
                w91 w91Var2 = this.b;
                int L0 = w91Var2.F.L0();
                if (L0 != -1) {
                    v4.d1 K = recyclerView.K(L0);
                    int top = K != null ? K.a.getTop() : 0;
                    if (L0 == 0) {
                        int i11 = 0 - top;
                        z9 = top < 0;
                        Math.abs(i11);
                    } else {
                        z9 = L0 > 0;
                    }
                    w91Var2.K0(z9 || !w91Var2.K, true);
                    break;
                }
                break;
            case 1:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (w91Var = this.b).g1) != null) {
                    gVar.f(i7, i10);
                    w91Var.B0();
                    break;
                }
                break;
        }
    }
}
