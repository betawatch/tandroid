package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fr0 extends org.telegram.ui.en {
    public final /* synthetic */ ys0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.r4 r4Var, Bundle bundle) {
        super(context, r4Var, bundle);
        this.f = ys0Var;
    }

    @Override // org.telegram.ui.en
    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f.p0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
    }
}
