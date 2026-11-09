package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q01 extends v01 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ s11 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(s11 s11Var, Context context, int i7) {
        super(s11Var, context);
        this.n3 = s11Var;
        this.m3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            s11 s11Var = this.n3;
            s11Var.x1 = false;
            if (s11Var.a == -1 || s11Var.f0.getVisibility() != 0 || s11Var.f0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            s11.a(s11Var, s11Var.f0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        s11 s11Var = this.n3;
        s11Var.h();
        if (!s11Var.x1) {
            int I0 = s11Var.r0.I0();
            ArrayList arrayList = s11Var.D0;
            SparseIntArray sparseIntArray = s11Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || s11Var.C0) ? arrayList.size() + (s11Var.N0 ? 1 : 0) : 40) && I0 > s11Var.I0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.uw uwVar = valueAt >= 0 ? (org.telegram.ui.Components.uw) s11Var.M0.get(valueAt) : null;
                        if (uwVar != null) {
                            boolean z9 = uwVar.h;
                            int size = uwVar.c.size();
                            if (!z9) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.bv bvVar = s11Var.d0;
                                bvVar.j(((bvVar.E == null || !bvVar.b0) ? 0 : 1) + (bvVar.D != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    s11Var.d0.j(0, true);
                }
            }
        }
        s11Var.C();
        org.telegram.messenger.g0.Z3(s11Var.e0, s11Var.h0.computeVerticalScrollOffset() != 0 || (i10 = this.m3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        s11Var.m();
    }
}
