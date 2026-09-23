package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class et0 extends org.telegram.ui.zn {
    public final /* synthetic */ yu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context, c5Var, bundle);
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.zn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f.n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
