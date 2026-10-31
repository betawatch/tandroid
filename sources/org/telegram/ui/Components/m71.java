package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m71 extends v71 {
    public final /* synthetic */ w71 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(w71 w71Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, z10);
        this.t0 = w71Var;
    }

    @Override // org.telegram.ui.Components.v71
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.w.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        u71 u71Var = this.D;
        if (u71Var != null) {
            ((w71) ((n2.u) u71Var).b).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
