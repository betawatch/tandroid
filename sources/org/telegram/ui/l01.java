package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l01 extends q01 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ n11 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(n11 n11Var, Context context, int i7) {
        super(n11Var, context);
        this.o3 = n11Var;
        this.n3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            n11 n11Var = this.o3;
            n11Var.y1 = false;
            if (n11Var.a == -1 || n11Var.g0.getVisibility() != 0 || n11Var.g0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            n11.a(n11Var, n11Var.g0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        n11 n11Var = this.o3;
        n11Var.h();
        if (!n11Var.y1) {
            int I0 = n11Var.s0.I0();
            ArrayList arrayList = n11Var.E0;
            SparseIntArray sparseIntArray = n11Var.x0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || n11Var.D0) ? arrayList.size() + (n11Var.O0 ? 1 : 0) : 40) && I0 > n11Var.J0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.zw zwVar = valueAt >= 0 ? (org.telegram.ui.Components.zw) n11Var.N0.get(valueAt) : null;
                        if (zwVar != null) {
                            boolean z10 = zwVar.h;
                            int size = zwVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.gv gvVar = n11Var.e0;
                                gvVar.j(((gvVar.F == null || !gvVar.c0) ? 0 : 1) + (gvVar.E != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    n11Var.e0.j(0, true);
                }
            }
        }
        n11Var.C();
        org.telegram.messenger.g0.Y3(n11Var.f0, n11Var.i0.computeVerticalScrollOffset() != 0 || (i10 = this.n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        n11Var.m();
    }
}
