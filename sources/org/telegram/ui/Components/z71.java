package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z71 extends i81 {
    public final /* synthetic */ j81 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z71(j81 j81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z10);
        this.t0 = j81Var;
    }

    @Override // org.telegram.ui.Components.i81
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            h81 h81Var = this.y;
            if (h81Var != null) {
                b81 b81Var = ((j81) ((ka.c) h81Var).b).L;
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
        h81 h81Var2 = this.y;
        if (h81Var2 != null) {
            ((j81) ((ka.c) h81Var2).b).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
