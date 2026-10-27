package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class so0 extends ct {
    public final /* synthetic */ org.telegram.ui.mx k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so0(org.telegram.ui.mx mxVar, nm0 nm0Var, Context context, int i10, int i11) {
        super(nm0Var, context, i10, i11, false, null);
        this.k0 = mxVar;
    }

    @Override // org.telegram.ui.Components.k71
    public final void O(boolean z10) {
        ArrayList arrayList;
        super.O(z10);
        ro0 ro0Var = this.k0.n0;
        ro0Var.e(this.b0 || this.c0 || (arrayList = this.V) == null || !arrayList.isEmpty(), z10);
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.e.setVisibility(8);
    }
}
