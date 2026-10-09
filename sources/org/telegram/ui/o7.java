package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o7 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ j7 l0;
    public final /* synthetic */ p7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(p7 p7Var, Context context, j7 j7Var) {
        super(context, 0, null);
        this.m0 = p7Var;
        this.l0 = j7Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a() {
        r7 r7Var = this.m0.n;
        j7 j7Var = this.l0;
        r7.b(r7Var, (zh.a) j7Var.getTag(), j7Var);
    }
}
