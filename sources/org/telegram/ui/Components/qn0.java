package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qn0 extends os {
    public final /* synthetic */ org.telegram.ui.zx f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(org.telegram.ui.zx zxVar, rl0 rl0Var, Context context, int i10, int i11) {
        super(rl0Var, context, i10, i11, false, null);
        this.f0 = zxVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z4) {
        ArrayList arrayList;
        super.N(z4);
        pn0 pn0Var = this.f0.i0;
        pn0Var.e(this.W || this.X || (arrayList = this.Q) == null || !arrayList.isEmpty(), z4);
        pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var.e.setVisibility(8);
    }
}
