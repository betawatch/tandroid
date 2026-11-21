package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q01 extends v01 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ s11 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(s11 s11Var, Context context, int i7) {
        super(s11Var, context);
        this.o3 = s11Var;
        this.n3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            s11 s11Var = this.o3;
            s11Var.y1 = false;
            if (s11Var.a == -1 || s11Var.g0.getVisibility() != 0 || s11Var.g0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            s11.a(s11Var, s11Var.g0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        s11 s11Var = this.o3;
        s11Var.h();
        if (!s11Var.y1) {
            int I0 = s11Var.s0.I0();
            ArrayList arrayList = s11Var.E0;
            SparseIntArray sparseIntArray = s11Var.x0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || s11Var.D0) ? arrayList.size() + (s11Var.O0 ? 1 : 0) : 40) && I0 > s11Var.J0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.hx hxVar = valueAt >= 0 ? (org.telegram.ui.Components.hx) s11Var.N0.get(valueAt) : null;
                        if (hxVar != null) {
                            boolean z10 = hxVar.h;
                            int size = hxVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.ov ovVar = s11Var.e0;
                                ovVar.j(((ovVar.F == null || !ovVar.c0) ? 0 : 1) + (ovVar.E != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    s11Var.e0.j(0, true);
                }
            }
        }
        s11Var.C();
        org.telegram.messenger.g0.X3(s11Var.f0, s11Var.i0.computeVerticalScrollOffset() != 0 || (i10 = this.n3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        s11Var.m();
    }
}
