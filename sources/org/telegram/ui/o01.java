package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o01 extends t01 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ q11 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o01(q11 q11Var, Context context, int i7) {
        super(q11Var, context);
        this.n3 = q11Var;
        this.m3 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            q11 q11Var = this.n3;
            q11Var.x1 = false;
            if (q11Var.a == -1 || q11Var.f0.getVisibility() != 0 || q11Var.f0.getTranslationY() <= (-org.telegram.messenger.g0.L(51.0f))) {
                return;
            }
            q11.a(q11Var, q11Var.f0.getTranslationY() > ((float) (-org.telegram.messenger.g0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        int i10;
        q11 q11Var = this.n3;
        q11Var.h();
        if (!q11Var.x1) {
            int I0 = q11Var.r0.I0();
            ArrayList arrayList = q11Var.D0;
            SparseIntArray sparseIntArray = q11Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || q11Var.C0) ? arrayList.size() + (q11Var.N0 ? 1 : 0) : 40) && I0 > q11Var.I0.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i11);
                        int valueAt = sparseIntArray.valueAt(i11);
                        org.telegram.ui.Components.uw uwVar = valueAt >= 0 ? (org.telegram.ui.Components.uw) q11Var.M0.get(valueAt) : null;
                        if (uwVar != null) {
                            boolean z9 = uwVar.h;
                            int size = uwVar.c.size();
                            if (!z9) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.bv bvVar = q11Var.d0;
                                bvVar.j(((bvVar.E == null || !bvVar.b0) ? 0 : 1) + (bvVar.D != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i11++;
                    }
                } else {
                    q11Var.d0.j(0, true);
                }
            }
        }
        q11Var.C();
        org.telegram.messenger.g0.Z3(q11Var.e0, q11Var.h0.computeVerticalScrollOffset() != 0 || (i10 = this.m3) == 0 || i10 == 12 || i10 == 10 || i10 == 1 || i10 == 11 || i10 == 6, 1.0f, true, true);
        q11Var.m();
    }
}
