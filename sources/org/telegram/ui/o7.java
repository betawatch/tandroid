package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o7 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ j7 h0;
    public final /* synthetic */ p7 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(p7 p7Var, Context context, j7 j7Var) {
        super(context, 0, null);
        this.i0 = p7Var;
        this.h0 = j7Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final void a() {
        r7 r7Var = this.i0.n;
        j7 j7Var = this.h0;
        r7.b(r7Var, (hh.a) j7Var.getTag(), j7Var);
    }
}
