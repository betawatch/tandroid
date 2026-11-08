package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k61 extends u61 {
    public final /* synthetic */ v61 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(v61 v61Var, Context context, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var, z9);
        this.t0 = v61Var;
    }

    @Override // org.telegram.ui.Components.u61
    public final void e(float f10, int i7, int i10) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.F = i7;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i7);
        if (f11 > 0.0f) {
            this.L = i10;
            this.M = sparseIntArray.get(i10);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f11;
        this.w.g1();
        invalidate();
        c(i7);
        if (f11 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i10;
            this.G = sparseIntArray.get(i10);
        }
        t61 t61Var = this.D;
        if (t61Var != null) {
            ((v61) ((n) t61Var).a).s();
        }
        this.t0.z(f10 <= 0.5f ? i7 : i10, i7 < i10);
    }
}
