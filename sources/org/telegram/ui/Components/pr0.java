package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pr0 extends org.telegram.ui.dn {
    public final /* synthetic */ it0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(it0 it0Var, Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context, r4Var, bundle);
        this.f = it0Var;
    }

    @Override // org.telegram.ui.dn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.q0 q0Var = this.f.q0;
        if (q0Var != null) {
            q0Var.setShowSearchProgress(z10);
        }
    }
}
