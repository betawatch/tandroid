package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s81 extends b91 {
    public final /* synthetic */ c91 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s81(c91 c91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.t0 = c91Var;
    }

    @Override // org.telegram.ui.Components.b91
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            a91 a91Var = this.y;
            if (a91Var != null) {
                u81 u81Var = ((c91) ((l2.f) a91Var).b).L;
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
        a91 a91Var2 = this.y;
        if (a91Var2 != null) {
            ((c91) ((l2.f) a91Var2).b).s();
        }
        this.t0.y(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
