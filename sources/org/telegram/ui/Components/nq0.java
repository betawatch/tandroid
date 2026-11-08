package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class nq0 extends av0 {
    public final /* synthetic */ xs0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(xs0 xs0Var, Context context, mz mzVar) {
        super(context, mzVar, 1, null);
        this.K = xs0Var;
    }

    @Override // org.telegram.ui.Components.av0
    public final void a() {
        invalidate();
        this.K.P0();
    }
}
