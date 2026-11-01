package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n71 extends w71 {
    public final /* synthetic */ x71 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n71(x71 x71Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, z10);
        this.t0 = x71Var;
    }

    @Override // org.telegram.ui.Components.w71
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
        v71 v71Var = this.D;
        if (v71Var != null) {
            ((x71) ((n2.u) v71Var).b).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
