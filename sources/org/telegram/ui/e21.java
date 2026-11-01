package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e21 extends j21 {
    public final /* synthetic */ int m3;
    public final /* synthetic */ g31 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(g31 g31Var, Context context, int i10) {
        super(g31Var, context);
        this.n3 = g31Var;
        this.m3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        if (i10 == 0) {
            g31 g31Var = this.n3;
            g31Var.x1 = false;
            if (g31Var.a == -1 || g31Var.f0.getVisibility() != 0 || g31Var.f0.getTranslationY() <= (-org.telegram.messenger.i0.L(51.0f))) {
                return;
            }
            g31.a(g31Var, g31Var.f0.getTranslationY() > ((float) (-org.telegram.messenger.i0.L(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        int i11;
        g31 g31Var = this.n3;
        g31Var.h();
        if (!g31Var.x1) {
            int I0 = g31Var.r0.I0();
            ArrayList arrayList = g31Var.D0;
            SparseIntArray sparseIntArray = g31Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || g31Var.C0) ? arrayList.size() + (g31Var.N0 ? 1 : 0) : 40) && I0 > g31Var.I0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.ix ixVar = valueAt >= 0 ? (org.telegram.ui.Components.ix) g31Var.M0.get(valueAt) : null;
                        if (ixVar != null) {
                            boolean z10 = ixVar.h;
                            int size = ixVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.mv mvVar = g31Var.d0;
                                mvVar.j(((mvVar.E == null || !mvVar.b0) ? 0 : 1) + (mvVar.D != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    g31Var.d0.j(0, true);
                }
            }
        }
        g31Var.C();
        org.telegram.messenger.i0.Y3(g31Var.e0, g31Var.h0.computeVerticalScrollOffset() != 0 || (i11 = this.m3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true, true);
        g31Var.m();
    }
}
