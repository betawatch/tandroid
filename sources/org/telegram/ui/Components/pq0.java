package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pq0 extends cv0 {
    public final /* synthetic */ zs0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(zs0 zs0Var, Context context, mz mzVar) {
        super(context, mzVar, 1, null);
        this.K = zs0Var;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void a() {
        invalidate();
        this.K.Q0();
    }
}
