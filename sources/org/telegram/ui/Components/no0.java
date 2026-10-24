package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class no0 extends at {
    public final /* synthetic */ org.telegram.ui.nx k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(org.telegram.ui.nx nxVar, mm0 mm0Var, Context context, int i10, int i11) {
        super(mm0Var, context, i10, i11, false, null);
        this.k0 = nxVar;
    }

    @Override // org.telegram.ui.Components.b71
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        mo0 mo0Var = this.k0.l0;
        mo0Var.e(this.b0 || this.c0 || (arrayList = this.V) == null || !arrayList.isEmpty(), z10);
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
    }
}
