package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o61 extends t61 {
    public final /* synthetic */ int d3;
    public final /* synthetic */ r71 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(r71 r71Var, Context context, int i10) {
        super(r71Var, context);
        this.e3 = r71Var;
        this.d3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        r71 r71Var = this.e3;
        i61 i61Var = r71Var.f0;
        if (i10 == 0) {
            r71Var.w1 = false;
            if (r71Var.a == -1 || i61Var.getVisibility() != 0 || i61Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            r71.a(r71Var, i61Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        r71 r71Var = this.e3;
        r71Var.h();
        if (!r71Var.w1) {
            int I0 = r71Var.r0.I0();
            ArrayList arrayList = r71Var.D0;
            SparseIntArray sparseIntArray = r71Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || r71Var.C0) ? arrayList.size() + (r71Var.N0 ? 1 : 0) : 40) && I0 > r71Var.I0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.jy jyVar = valueAt >= 0 ? (org.telegram.ui.Components.jy) r71Var.M0.get(valueAt) : null;
                        if (jyVar != null) {
                            boolean z10 = jyVar.h;
                            int size = jyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.ow owVar = r71Var.d0;
                                owVar.j(((owVar.E == null || !owVar.b0) ? 0 : 1) + (owVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    r71Var.d0.j(0, true);
                }
            }
        }
        r71Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(r71Var.e0, r71Var.h0.computeVerticalScrollOffset() != 0 || (i12 = this.d3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        r71Var.m();
    }
}
