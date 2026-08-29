package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n7 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ i7 h0;
    public final /* synthetic */ o7 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(o7 o7Var, Context context, i7 i7Var) {
        super(context, 0, null);
        this.i0 = o7Var;
        this.h0 = i7Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final void a() {
        q7 q7Var = this.i0.n;
        i7 i7Var = this.h0;
        q7.b(q7Var, (kh.a) i7Var.getTag(), i7Var);
    }
}
