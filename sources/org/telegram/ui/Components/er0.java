package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class er0 extends org.telegram.ui.ym {
    public final /* synthetic */ ws0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context, q4Var, bundle);
        this.f = ws0Var;
    }

    @Override // org.telegram.ui.ym
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f.q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
