package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dt0 extends org.telegram.ui.zn {
    public final /* synthetic */ yu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context, e5Var, bundle);
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.zn
    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.k0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
    }
}
