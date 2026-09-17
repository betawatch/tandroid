package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class p7 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ k7 l0;
    public final /* synthetic */ q7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(q7 q7Var, Context context, k7 k7Var) {
        super(context, 0, null);
        this.m0 = q7Var;
        this.l0 = k7Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final void a() {
        s7 s7Var = this.m0.n;
        k7 k7Var = this.l0;
        s7.b(s7Var, (ai.b) k7Var.getTag(), k7Var);
    }
}
