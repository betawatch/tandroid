package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class et0 extends org.telegram.ui.zn {
    public final /* synthetic */ zu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context, f5Var, bundle);
        this.f = zu0Var;
    }

    @Override // org.telegram.ui.zn
    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.k0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
    }
}
