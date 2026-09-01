package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o51 extends t51 {
    public final /* synthetic */ int c3;
    public final /* synthetic */ r61 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(r61 r61Var, Context context, int i10) {
        super(r61Var, context);
        this.d3 = r61Var;
        this.c3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        r61 r61Var = this.d3;
        i51 i51Var = r61Var.c0;
        if (i10 == 0) {
            r61Var.t1 = false;
            if (r61Var.a == -1 || i51Var.getVisibility() != 0 || i51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            r61.a(r61Var, i51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        r61 r61Var = this.d3;
        r61Var.h();
        if (!r61Var.t1) {
            int I0 = r61Var.o0.I0();
            ArrayList arrayList = r61Var.A0;
            SparseIntArray sparseIntArray = r61Var.t0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || r61Var.z0) ? arrayList.size() + (r61Var.K0 ? 1 : 0) : 40) && I0 > r61Var.F0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.xx xxVar = valueAt >= 0 ? (org.telegram.ui.Components.xx) r61Var.J0.get(valueAt) : null;
                        if (xxVar != null) {
                            boolean z4 = xxVar.h;
                            int size = xxVar.c.size();
                            if (!z4) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.zv zvVar = r61Var.a0;
                                zvVar.j(((zvVar.B == null || !zvVar.V) ? 0 : 1) + (zvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    r61Var.a0.j(0, true);
                }
            }
        }
        r61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(r61Var.b0, r61Var.e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        r61Var.m();
    }
}
