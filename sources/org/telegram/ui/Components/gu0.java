package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gu0 extends org.telegram.ui.yn {
    public final /* synthetic */ bw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context, j5Var, bundle);
        this.f = bw0Var;
    }

    @Override // org.telegram.ui.yn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.p0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
