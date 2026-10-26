package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uo0 extends p40 {
    public final /* synthetic */ org.telegram.ui.jx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(org.telegram.ui.jx jxVar, mm0 mm0Var, Context context, int i10) {
        super(mm0Var, context, i10);
        this.e0 = jxVar;
    }

    @Override // org.telegram.ui.Components.j71
    public final void O(boolean z10) {
        super.O(z10);
        qo0 qo0Var = this.e0.u0;
        qo0Var.e(false, z10);
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
    }
}
