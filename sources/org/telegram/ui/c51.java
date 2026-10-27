package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c51 extends h51 {
    public final /* synthetic */ int n3;
    public final /* synthetic */ f61 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(f61 f61Var, Context context, int i10) {
        super(f61Var, context);
        this.o3 = f61Var;
        this.n3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        f61 f61Var = this.o3;
        w41 w41Var = f61Var.f0;
        if (i10 == 0) {
            f61Var.x1 = false;
            if (f61Var.a == -1 || w41Var.getVisibility() != 0 || w41Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            f61.a(f61Var, w41Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        int i11;
        f61 f61Var = this.o3;
        f61Var.h();
        if (!f61Var.x1) {
            int I0 = f61Var.r0.I0();
            ArrayList arrayList = f61Var.D0;
            SparseIntArray sparseIntArray = f61Var.w0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || f61Var.C0) ? arrayList.size() + (f61Var.N0 ? 1 : 0) : 40) && I0 > f61Var.I0.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i12);
                        int valueAt = sparseIntArray.valueAt(i12);
                        org.telegram.ui.Components.ey eyVar = valueAt >= 0 ? (org.telegram.ui.Components.ey) f61Var.M0.get(valueAt) : null;
                        if (eyVar != null) {
                            boolean z10 = eyVar.h;
                            int size = eyVar.c.size();
                            if (!z10) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.kw kwVar = f61Var.d0;
                                kwVar.j(((kwVar.E == null || !kwVar.b0) ? 0 : 1) + (kwVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i12++;
                    }
                } else {
                    f61Var.d0.j(0, true);
                }
            }
        }
        f61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(f61Var.e0, f61Var.h0.computeVerticalScrollOffset() != 0 || (i11 = this.n3) == 0 || i11 == 12 || i11 == 10 || i11 == 1 || i11 == 11 || i11 == 6, 1.0f, true);
        f61Var.m();
    }
}
