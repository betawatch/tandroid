package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class uo0 extends ct {
    public final /* synthetic */ org.telegram.ui.ey f0;
    public final /* synthetic */ org.telegram.ui.nx g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(org.telegram.ui.nx nxVar, mm0 mm0Var, Context context, int i10, int i11, org.telegram.ui.ey eyVar) {
        super(mm0Var, context, i10, i11);
        this.g0 = nxVar;
        this.f0 = eyVar;
    }

    @Override // org.telegram.ui.Components.b71
    public final void N(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.N(z10);
        mo0 mo0Var = this.g0.g0;
        mo0Var.e(this.Y || this.Z || (arrayList = this.R) == null || !arrayList.isEmpty() || (arrayList2 = this.S) == null || !arrayList2.isEmpty() || (arrayList3 = this.U) == null || !arrayList3.isEmpty() || (arrayList4 = this.T) == null || !arrayList4.isEmpty(), z10);
        if (!TextUtils.isEmpty(this.d0)) {
            mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
            mo0Var.e.setVisibility(8);
        } else {
            mo0Var.d.setText(LocaleController.getString(R.string.NoChannelsTitle));
            mo0Var.e.setVisibility(0);
            mo0Var.e.setText(LocaleController.getString(R.string.NoChannelsMessage));
        }
    }
}
