package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c71 extends m71 {
    public final /* synthetic */ n71 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(n71 n71Var, Context context, boolean z10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, context, b6Var, z10);
        this.p0 = n71Var;
    }

    @Override // org.telegram.ui.Components.m71
    public final void e(float f10, int i9, int i10) {
        float f11 = f10 < 0.0f ? 0.0f : f10 > 1.0f ? 1.0f : f10;
        this.B = i9;
        SparseIntArray sparseIntArray = this.U;
        this.C = sparseIntArray.get(i9);
        if (f11 > 0.0f) {
            l71 l71Var = this.y;
            if (l71Var != null) {
                e71 e71Var = ((n71) ((n2.p) l71Var).b).H;
            }
            this.H = i10;
            this.I = sparseIntArray.get(i10);
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f11;
        this.v.f1();
        invalidate();
        c(i9);
        if (f11 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i10;
            this.C = sparseIntArray.get(i10);
        }
        l71 l71Var2 = this.y;
        if (l71Var2 != null) {
            ((n71) ((n2.p) l71Var2).b).s();
        }
        this.p0.y(f10 <= 0.5f ? i9 : i10, i9 < i10);
    }
}
