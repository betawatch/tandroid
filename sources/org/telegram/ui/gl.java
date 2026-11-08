package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ jl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(jl jlVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.f = jlVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        an anVar = this.f.Q;
        int i7 = an.id;
        return anVar.l9();
    }
}
