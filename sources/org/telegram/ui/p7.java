package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p7 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ k7 h0;
    public final /* synthetic */ q7 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(q7 q7Var, Context context, k7 k7Var) {
        super(context, 0, null);
        this.i0 = q7Var;
        this.h0 = k7Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final void a() {
        s7 s7Var = this.i0.n;
        k7 k7Var = this.h0;
        s7.b(s7Var, (ih.a) k7Var.getTag(), k7Var);
    }
}
