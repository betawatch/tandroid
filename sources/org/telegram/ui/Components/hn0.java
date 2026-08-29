package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hn0 extends ls {
    public final /* synthetic */ org.telegram.ui.ox e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(org.telegram.ui.ox oxVar, jl0 jl0Var, Context context, int i10, int i11) {
        super(jl0Var, context, i10, i11, false, null);
        this.e0 = oxVar;
    }

    @Override // org.telegram.ui.Components.k51
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        gn0 gn0Var = this.e0.h0;
        gn0Var.e(this.V || this.W || (arrayList = this.P) == null || !arrayList.isEmpty(), z10);
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.e.setVisibility(8);
    }
}
