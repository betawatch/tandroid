package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kk0 extends c10 {
    public final /* synthetic */ pk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk0(pk0 pk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.U = pk0Var;
    }

    @Override // org.telegram.ui.Components.c10
    public final int getAdditionalHeight() {
        mb0 mb0Var;
        pk0 pk0Var = this.U;
        if (pk0Var.H.isEmpty() || (mb0Var = pk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + mb0Var.getMeasuredHeight();
    }
}
