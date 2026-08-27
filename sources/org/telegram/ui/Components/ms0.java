package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ms0 extends org.telegram.ui.tn {
    public final /* synthetic */ hu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(hu0 hu0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f = hu0Var;
    }

    @Override // org.telegram.ui.tn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f.j0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
