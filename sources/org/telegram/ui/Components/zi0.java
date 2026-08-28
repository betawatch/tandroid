package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zi0 extends e00 {
    public final /* synthetic */ ej0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.Q = ej0Var;
    }

    @Override // org.telegram.ui.Components.e00
    public final int getAdditionalHeight() {
        ca0 ca0Var;
        ej0 ej0Var = this.Q;
        if (ej0Var.D.isEmpty() || (ca0Var = ej0Var.F) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ca0Var.getMeasuredHeight();
    }
}
