package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class o81 extends y81 {
    public final /* synthetic */ z81 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(z81 z81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z10);
        this.t0 = z81Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final void e(float f7, int i10, int i11) {
        float f10 = f7 < 0.0f ? 0.0f : f7 > 1.0f ? 1.0f : f7;
        this.F = i10;
        SparseIntArray sparseIntArray = this.b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            x81 x81Var = this.y;
            if (x81Var != null) {
                q81 q81Var = ((z81) ((ki.e0) x81Var).b).L;
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
        x81 x81Var2 = this.y;
        if (x81Var2 != null) {
            ((z81) ((ki.e0) x81Var2).b).s();
        }
        this.t0.z(f7 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
