package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.vn {
    public final /* synthetic */ qu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(qu0 qu0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f = qu0Var;
    }

    @Override // org.telegram.ui.vn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.j0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
