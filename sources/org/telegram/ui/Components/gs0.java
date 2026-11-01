package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gs0 extends org.telegram.ui.wn {
    public final /* synthetic */ au0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(au0 au0Var, Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context, z4Var, bundle);
        this.f = au0Var;
    }

    @Override // org.telegram.ui.wn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f.p0;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
    }
}
