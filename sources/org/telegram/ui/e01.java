package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e01 extends j01 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ g11 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(g11 g11Var, Context context, int i3) {
        super(g11Var, context);
        this.o3 = g11Var;
        this.n3 = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i3) {
        if (i3 == 0) {
            g11 g11Var = this.o3;
            g11Var.y1 = false;
            if (g11Var.a == -1 || g11Var.g0.getVisibility() != 0 || g11Var.g0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            g11.a(g11Var, g11Var.g0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i3) {
        int i10;
        g11 g11Var = this.o3;
        g11Var.h();
        if (!g11Var.y1) {
            int I0 = g11Var.s0.I0();
            ArrayList arrayList = g11Var.E0;
            SparseIntArray sparseIntArray = g11Var.x0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || g11Var.D0) ? arrayList.size() + (g11Var.O0 ? 1 : 0) : 40) && I0 > g11Var.J0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.sw swVar = valueAt >= 0 ? (org.telegram.ui.Components.sw) g11Var.N0.get(valueAt) : null;
                        if (swVar != null) {
                            boolean z10 = swVar.h;
                            int size = swVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.zu zuVar = g11Var.e0;
                                zuVar.j(((zuVar.F == null || !zuVar.c0) ? 0 : 1) + (zuVar.E != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    g11Var.e0.j(0, true);
                }
            }
        }
        g11Var.C();
        org.telegram.messenger.g0.Z3(g11Var.f0, g11Var.i0.computeVerticalScrollOffset() != 0 || (i10 = this.n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        g11Var.m();
    }
}
