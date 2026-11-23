package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o01 extends t01 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ q11 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o01(q11 q11Var, Context context, int i7) {
        super(q11Var, context);
        this.o3 = q11Var;
        this.n3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            q11 q11Var = this.o3;
            q11Var.y1 = false;
            if (q11Var.a == -1 || q11Var.g0.getVisibility() != 0 || q11Var.g0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            q11.a(q11Var, q11Var.g0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        q11 q11Var = this.o3;
        q11Var.h();
        if (!q11Var.y1) {
            int I0 = q11Var.s0.I0();
            ArrayList arrayList = q11Var.E0;
            SparseIntArray sparseIntArray = q11Var.x0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || q11Var.D0) ? arrayList.size() + (q11Var.O0 ? 1 : 0) : 40) && I0 > q11Var.J0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.ex exVar = valueAt >= 0 ? (org.telegram.ui.Components.ex) q11Var.N0.get(valueAt) : null;
                        if (exVar != null) {
                            boolean z10 = exVar.h;
                            int size = exVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.lv lvVar = q11Var.e0;
                                lvVar.j(((lvVar.F == null || !lvVar.c0) ? 0 : 1) + (lvVar.E != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    q11Var.e0.j(0, true);
                }
            }
        }
        q11Var.C();
        org.telegram.messenger.g0.X3(q11Var.f0, q11Var.i0.computeVerticalScrollOffset() != 0 || (i10 = this.n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        q11Var.m();
    }
}
