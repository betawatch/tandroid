package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t81 extends c91 {
    public final /* synthetic */ d91 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(d91 d91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.t0 = d91Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            b91 b91Var = this.y;
            if (b91Var != null) {
                v81 v81Var = ((d91) ((l2.f) b91Var).b).L;
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
        b91 b91Var2 = this.y;
        if (b91Var2 != null) {
            ((d91) ((l2.f) b91Var2).b).s();
        }
        this.t0.y(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
