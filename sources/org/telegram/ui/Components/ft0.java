package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.eo {
    public final /* synthetic */ zu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context, e5Var, bundle);
        this.f = zu0Var;
    }

    @Override // org.telegram.ui.eo
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.n0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
