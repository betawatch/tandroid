package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g21 extends l21 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ i31 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(i31 i31Var, Context context, int i10) {
        super(i31Var, context);
        this.n3 = i31Var;
        this.m3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        if (i10 == 0) {
            i31 i31Var = this.n3;
            i31Var.x1 = false;
            if (i31Var.a == -1 || i31Var.f0.getVisibility() != 0 || i31Var.f0.getTranslationY() <= (-org.telegram.messenger.i0.L(51.0f))) {
                return;
            }
            i31.a(i31Var, i31Var.f0.getTranslationY() > ((float) (-org.telegram.messenger.i0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        int i11;
        i31 i31Var = this.n3;
        i31Var.h();
        if (!i31Var.x1) {
            int I0 = i31Var.r0.I0();
            ArrayList arrayList = i31Var.D0;
            SparseIntArray sparseIntArray = i31Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || i31Var.C0) ? arrayList.size() + (i31Var.N0 ? 1 : 0) : 40) && I0 > i31Var.I0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.ix ixVar = valueAt >= 0 ? (org.telegram.ui.Components.ix) i31Var.M0.get(valueAt) : null;
                        if (ixVar != null) {
                            boolean z10 = ixVar.h;
                            int size = ixVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.mv mvVar = i31Var.d0;
                                mvVar.j(((mvVar.E == null || !mvVar.b0) ? 0 : 1) + (mvVar.D != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    i31Var.d0.j(0, true);
                }
            }
        }
        i31Var.C();
        org.telegram.messenger.i0.Y3(i31Var.e0, i31Var.h0.computeVerticalScrollOffset() != 0 || (i11 = this.m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true, true);
        i31Var.m();
    }
}
