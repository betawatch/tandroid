package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dt0 extends org.telegram.ui.zn {
    public final /* synthetic */ yu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context, f5Var, bundle);
        this.f = yu0Var;
    }

    @Override // org.telegram.ui.zn
    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.k0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
    }
}
