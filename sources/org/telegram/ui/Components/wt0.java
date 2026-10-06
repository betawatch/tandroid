package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class wt0 extends org.telegram.ui.ao {
    public final /* synthetic */ qv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt0(qv0 qv0Var, Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context, c5Var, bundle);
        this.f = qv0Var;
    }

    @Override // org.telegram.ui.ao
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f.n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
