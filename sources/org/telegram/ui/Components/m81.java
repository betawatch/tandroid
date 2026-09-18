package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class m81 extends w81 {
    public final /* synthetic */ x81 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m81(x81 x81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, context, e6Var, z10);
        this.t0 = x81Var;
    }

    @Override // org.telegram.ui.Components.w81
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            v81 v81Var = this.y;
            if (v81Var != null) {
                o81 o81Var = ((x81) ((l.d) v81Var).a).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        v81 v81Var2 = this.y;
        if (v81Var2 != null) {
            ((x81) ((l.d) v81Var2).a).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
