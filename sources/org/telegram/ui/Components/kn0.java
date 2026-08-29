package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kn0 extends c40 {
    public final /* synthetic */ org.telegram.ui.ox Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(org.telegram.ui.ox oxVar, jl0 jl0Var, Context context, int i10) {
        super(jl0Var, context, i10);
        this.Y = oxVar;
    }

    @Override // org.telegram.ui.Components.k51
    public final void N(boolean z10) {
        super.N(z10);
        gn0 gn0Var = this.Y.o0;
        gn0Var.e(false, z10);
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.e.setVisibility(8);
    }
}
