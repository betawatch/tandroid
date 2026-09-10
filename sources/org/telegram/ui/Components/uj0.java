package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class uj0 extends a10 {
    public final /* synthetic */ zj0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = zj0Var;
    }

    @Override // org.telegram.ui.Components.a10
    public final int getAdditionalHeight() {
        db0 db0Var;
        zj0 zj0Var = this.U;
        if (zj0Var.H.isEmpty() || (db0Var = zj0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + db0Var.getMeasuredHeight();
    }
}
