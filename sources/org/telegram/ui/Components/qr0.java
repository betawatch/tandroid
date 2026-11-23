package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
