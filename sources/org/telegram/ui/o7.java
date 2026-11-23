package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class o7 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ j7 m0;
    public final /* synthetic */ p7 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(p7 p7Var, Context context, j7 j7Var) {
        super(0, context, null);
        this.n0 = p7Var;
        this.m0 = j7Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final void a() {
        s7 s7Var = this.n0.n;
        j7 j7Var = this.m0;
        s7.b(s7Var, (ei.b) j7Var.getTag(), j7Var);
    }
}
