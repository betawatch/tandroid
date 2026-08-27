package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e71 extends o71 {
    public final /* synthetic */ p71 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e71(p71 p71Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, z10);
        this.p0 = p71Var;
    }

    @Override // org.telegram.ui.Components.o71
    public final void e(float f10, int i10, int i11) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.B = i10;
        SparseIntArray sparseIntArray = this.U;
        this.C = sparseIntArray.get(i10);
        if (f11 > 0.0f) {
            n71 n71Var = this.y;
            if (n71Var != null) {
                g71 g71Var = ((p71) ((m5.o) n71Var).b).H;
            }
            this.H = i11;
            this.I = sparseIntArray.get(i11);
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f11;
        this.v.f1();
        invalidate();
        c(i10);
        if (f11 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i11;
            this.C = sparseIntArray.get(i11);
        }
        n71 n71Var2 = this.y;
        if (n71Var2 != null) {
            ((p71) ((m5.o) n71Var2).b).s();
        }
        this.p0.y(f10 <= 0.5f ? i10 : i11, i10 < i11);
    }
}
