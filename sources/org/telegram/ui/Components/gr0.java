package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gr0 extends org.telegram.ui.cn {
    public final /* synthetic */ ys0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.o4 o4Var, Bundle bundle) {
        super(context, o4Var, bundle);
        this.f = ys0Var;
    }

    @Override // org.telegram.ui.cn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f.q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
