package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k91 extends t91 {
    public final /* synthetic */ u91 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(u91 u91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, context, u6Var, z10);
        this.t0 = u91Var;
    }

    @Override // org.telegram.ui.Components.t91
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
        this.v.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        s91 s91Var = this.y;
        if (s91Var != null) {
            ((u91) ((jg.i) s91Var).a).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
