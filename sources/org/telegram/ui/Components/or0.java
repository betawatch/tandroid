package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class or0 extends org.telegram.ui.dn {
    public final /* synthetic */ gt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.s4 s4Var, Bundle bundle) {
        super(context, s4Var, bundle);
        this.f = gt0Var;
    }

    @Override // org.telegram.ui.dn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f.q0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z10);
        }
    }
}
