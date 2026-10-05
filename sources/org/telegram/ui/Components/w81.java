package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class w81 extends g91 {
    public final /* synthetic */ h91 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(h91 h91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.t0 = h91Var;
    }

    @Override // org.telegram.ui.Components.g91
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
        f91 f91Var = this.y;
        if (f91Var != null) {
            ((h91) ((n2.c) f91Var).b).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
