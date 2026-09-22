package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rt0 extends org.telegram.ui.bo {
    public final /* synthetic */ lv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f = lv0Var;
    }

    @Override // org.telegram.ui.bo
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f.n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
