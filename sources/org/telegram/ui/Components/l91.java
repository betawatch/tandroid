package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l91 extends u91 {
    public final /* synthetic */ v91 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(v91 v91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, context, u6Var, z10);
        this.t0 = v91Var;
    }

    @Override // org.telegram.ui.Components.u91
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
        t91 t91Var = this.y;
        if (t91Var != null) {
            ((v91) ((jg.i) t91Var).a).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
