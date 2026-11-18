package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p01 extends u01 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ r11 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(r11 r11Var, Context context, int i7) {
        super(r11Var, context);
        this.o3 = r11Var;
        this.n3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            r11 r11Var = this.o3;
            r11Var.y1 = false;
            if (r11Var.a == -1 || r11Var.g0.getVisibility() != 0 || r11Var.g0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            r11.a(r11Var, r11Var.g0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        r11 r11Var = this.o3;
        r11Var.h();
        if (!r11Var.y1) {
            int I0 = r11Var.s0.I0();
            ArrayList arrayList = r11Var.E0;
            SparseIntArray sparseIntArray = r11Var.x0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || r11Var.D0) ? arrayList.size() + (r11Var.O0 ? 1 : 0) : 40) && I0 > r11Var.J0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.fx fxVar = valueAt >= 0 ? (org.telegram.ui.Components.fx) r11Var.N0.get(valueAt) : null;
                        if (fxVar != null) {
                            boolean z10 = fxVar.h;
                            int size = fxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.lv lvVar = r11Var.e0;
                                lvVar.j(((lvVar.F == null || !lvVar.c0) ? 0 : 1) + (lvVar.E != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    r11Var.e0.j(0, true);
                }
            }
        }
        r11Var.C();
        org.telegram.messenger.g0.X3(r11Var.f0, r11Var.i0.computeVerticalScrollOffset() != 0 || (i10 = this.n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        r11Var.m();
    }
}
