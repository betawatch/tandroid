// default package

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k0a extends p0a {
    public final /* synthetic */ int n3;
    public final /* synthetic */ n1a o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0a(n1a n1aVar, Context context, int i) {
        super(n1aVar, context);
        this.o3 = n1aVar;
        this.n3 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        n1a n1aVar = this.o3;
        e0a e0aVar = n1aVar.g0;
        if (i == 0) {
            n1aVar.y1 = false;
            if (n1aVar.a == -1 || e0aVar.getVisibility() != 0 || e0aVar.getTranslationY() <= (-hl.L(51.0f))) {
                return;
            }
            n1aVar.u(e0aVar.getTranslationY() > ((float) (-hl.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        int i2;
        n1a n1aVar = this.o3;
        n1aVar.f();
        if (!n1aVar.y1) {
            int H0 = n1aVar.s0.H0();
            ArrayList arrayList = n1aVar.E0;
            SparseIntArray sparseIntArray = n1aVar.x0;
            if (H0 != -1) {
                if (H0 > ((arrayList.size() <= 40 || n1aVar.D0) ? arrayList.size() + (n1aVar.O0 ? 1 : 0) : 40) && H0 > n1aVar.J0.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        int valueAt = sparseIntArray.valueAt(i3);
                        c14 c14Var = valueAt >= 0 ? (c14) n1aVar.N0.get(valueAt) : null;
                        if (c14Var != null) {
                            boolean z = c14Var.h;
                            ArrayList arrayList2 = c14Var.c;
                            int size = z ? arrayList2.size() : Math.min(24, arrayList2.size());
                            if (H0 > keyAt && H0 <= keyAt + 1 + size) {
                                xy3 xy3Var = n1aVar.e0;
                                xy3Var.j(((xy3Var.E == null || !xy3Var.b0) ? 0 : 1) + (xy3Var.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i3++;
                    }
                } else {
                    n1aVar.e0.j(0, true);
                }
            }
        }
        n1aVar.C();
        hl.T3(n1aVar.f0, n1aVar.i0.computeVerticalScrollOffset() != 0 || (i2 = this.n3) == 0 || i2 == 12 || i2 == 10 || i2 == 1 || i2 == 11 || i2 == 6, 1.0f, true, true);
        n1aVar.l();
    }
}
