package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class et0 extends org.telegram.ui.eo {
    public final /* synthetic */ yu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.eo
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f.n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
