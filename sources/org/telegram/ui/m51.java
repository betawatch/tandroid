package org.telegram.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m51 extends r51 {
    public final /* synthetic */ int c3;
    public final /* synthetic */ q61 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m51(q61 q61Var, Context context, int i10) {
        super(q61Var, context);
        this.d3 = q61Var;
        this.c3 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        q61 q61Var = this.d3;
        g51 g51Var = q61Var.c0;
        if (i10 == 0) {
            q61Var.t1 = false;
            if (q61Var.a == -1 || g51Var.getVisibility() != 0 || g51Var.getTranslationY() <= (-AndroidUtilities.dp(51.0f))) {
                return;
            }
            q61.a(q61Var, g51Var.getTranslationY() > ((float) (-AndroidUtilities.dp(16.0f))) ? 0 : 1, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        int i12;
        q61 q61Var = this.d3;
        q61Var.h();
        if (!q61Var.t1) {
            int I0 = q61Var.o0.I0();
            ArrayList arrayList = q61Var.A0;
            SparseIntArray sparseIntArray = q61Var.t0;
            if (I0 != -1) {
                if (I0 > ((arrayList.size() <= 40 || q61Var.z0) ? arrayList.size() + (q61Var.K0 ? 1 : 0) : 40) && I0 > q61Var.F0.size()) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseIntArray.size()) {
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i13);
                        int valueAt = sparseIntArray.valueAt(i13);
                        org.telegram.ui.Components.vx vxVar = valueAt >= 0 ? (org.telegram.ui.Components.vx) q61Var.J0.get(valueAt) : null;
                        if (vxVar != null) {
                            boolean z4 = vxVar.h;
                            int size = vxVar.c.size();
                            if (!z4) {
                                size = Math.min(24, size);
                            }
                            if (I0 > keyAt && I0 <= keyAt + 1 + size) {
                                org.telegram.ui.Components.xv xvVar = q61Var.a0;
                                xvVar.j(((xvVar.B == null || !xvVar.V) ? 0 : 1) + (xvVar.y != null ? 1 : 0) + valueAt, true);
                            }
                        }
                        i13++;
                    }
                } else {
                    q61Var.a0.j(0, true);
                }
            }
        }
        q61Var.C();
        AndroidUtilities.updateViewVisibilityAnimated(q61Var.b0, q61Var.e0.computeVerticalScrollOffset() != 0 || (i12 = this.c3) == 0 || i12 == 12 || i12 == 10 || i12 == 1 || i12 == 11 || i12 == 6, 1.0f, true);
        q61Var.m();
    }
}
