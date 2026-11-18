package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
