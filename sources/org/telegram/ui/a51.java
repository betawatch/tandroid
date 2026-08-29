package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a51 extends f51 {
    public final /* synthetic */ int b3;
    public final /* synthetic */ d61 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a51(d61 d61Var, Context context, int i10) {
        super(d61Var, context);
        this.c3 = d61Var;
        this.b3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        d61 d61Var = this.c3;
        u41 u41Var = d61Var.b0;
        if (i10 == 0) {
            d61Var.s1 = false;
            if (d61Var.a == -1 || u41Var.getVisibility() != 0 || u41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            d61.a(d61Var, u41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        d61 d61Var = this.c3;
        d61Var.h();
        if (!d61Var.s1) {
            int I0 = d61Var.n0.I0();
            ArrayList arrayList = d61Var.z0;
            SparseIntArray sparseIntArray = d61Var.s0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || d61Var.y0) ? arrayList.size() + (d61Var.J0 ? 1 : 0) : 40) && I0 > d61Var.E0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.rx rxVar = valueAt >= 0 ? (org.telegram.ui.Components.rx) d61Var.I0.get(valueAt) : null;
                        if (rxVar != null) {
                            boolean z10 = rxVar.h;
                            int size = rxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.tv tvVar = d61Var.W;
                                tvVar.j(((tvVar.A == null || !tvVar.U) ? 0 : 1) + (tvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    d61Var.W.j(0, true);
                }
            }
        }
        d61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(d61Var.a0, d61Var.d0.computeVerticalScrollOffset() != 0 || (i12 = this.b3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        d61Var.m();
    }
}
