package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gr0 extends org.telegram.ui.en {
    public final /* synthetic */ zs0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context, q4Var, bundle);
        this.f = zs0Var;
    }

    @Override // org.telegram.ui.en
    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f.p0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
    }
}
