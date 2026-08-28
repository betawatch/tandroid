package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ks0 extends org.telegram.ui.sn {
    public final /* synthetic */ eu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f = eu0Var;
    }

    @Override // org.telegram.ui.sn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.j0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
