package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ko0 extends at {
    public final /* synthetic */ org.telegram.ui.lx i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(org.telegram.ui.lx lxVar, jm0 jm0Var, Context context, int i10, int i11) {
        super(jm0Var, context, i10, i11, false, null);
        this.i0 = lxVar;
    }

    @Override // org.telegram.ui.Components.u61
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        jo0 jo0Var = this.i0.l0;
        jo0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var.e.setVisibility(8);
    }
}
