package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class er0 extends org.telegram.ui.cn {
    public final /* synthetic */ xs0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context, q4Var, bundle);
        this.f = xs0Var;
    }

    @Override // org.telegram.ui.cn
    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f.p0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
    }
}
