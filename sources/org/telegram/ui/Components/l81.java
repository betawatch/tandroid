package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class l81 extends v81 {
    public final /* synthetic */ w81 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l81(w81 w81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.t0 = w81Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            u81 u81Var = this.y;
            if (u81Var != null) {
                n81 n81Var = ((w81) ((l.d) u81Var).a).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.f1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        u81 u81Var2 = this.y;
        if (u81Var2 != null) {
            ((w81) ((l.d) u81Var2).a).s();
        }
        this.t0.y(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
