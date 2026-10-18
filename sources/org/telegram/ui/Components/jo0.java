package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class jo0 extends at {
    public final /* synthetic */ org.telegram.ui.nx i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(org.telegram.ui.nx nxVar, im0 im0Var, Context context, int i10, int i11) {
        super(im0Var, context, i10, i11, false, null);
        this.i0 = nxVar;
    }

    @Override // org.telegram.ui.Components.s61
    public final void N(boolean z10) {
        ArrayList arrayList;
        super.N(z10);
        io0 io0Var = this.i0.l0;
        io0Var.e(this.Z || this.a0 || (arrayList = this.T) == null || !arrayList.isEmpty(), z10);
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
    }
}
