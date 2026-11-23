package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qr0 extends org.telegram.ui.dn {
    public final /* synthetic */ jt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context, r4Var, bundle);
        this.f = jt0Var;
    }

    @Override // org.telegram.ui.dn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f.q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
