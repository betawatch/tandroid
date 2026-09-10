package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nt0 extends org.telegram.ui.go {
    public final /* synthetic */ iv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context, f5Var, bundle);
        this.f = iv0Var;
    }

    @Override // org.telegram.ui.go
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.n0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
