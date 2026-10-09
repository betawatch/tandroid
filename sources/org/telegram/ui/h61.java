package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h61 extends m61 {
    public final /* synthetic */ int d3;
    public final /* synthetic */ k71 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(k71 k71Var, Context context, int i10) {
        super(k71Var, context);
        this.e3 = k71Var;
        this.d3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        k71 k71Var = this.e3;
        b61 b61Var = k71Var.f0;
        if (i10 == 0) {
            k71Var.w1 = false;
            if (k71Var.a == -1 || b61Var.getVisibility() != 0 || b61Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            k71.a(k71Var, b61Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        k71 k71Var = this.e3;
        k71Var.h();
        if (!k71Var.w1) {
            int I0 = k71Var.r0.I0();
            ArrayList arrayList = k71Var.D0;
            SparseIntArray sparseIntArray = k71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || k71Var.C0) ? arrayList.size() + (k71Var.N0 ? 1 : 0) : 40) && I0 > k71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.ny nyVar = valueAt >= 0 ? (org.telegram.ui.Components.ny) k71Var.M0.get(valueAt) : null;
                        if (nyVar != null) {
                            boolean z10 = nyVar.h;
                            int size = nyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.sw swVar = k71Var.d0;
                                swVar.j(((swVar.E == null || !swVar.b0) ? 0 : 1) + (swVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    k71Var.d0.j(0, true);
                }
            }
        }
        k71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(k71Var.e0, k71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        k71Var.m();
    }
}
