package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
