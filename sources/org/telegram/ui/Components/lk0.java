package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class lk0 extends b10 {
    public final /* synthetic */ qk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U = qk0Var;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getAdditionalHeight() {
        pb0 pb0Var;
        qk0 qk0Var = this.U;
        if (qk0Var.H.isEmpty() || (pb0Var = qk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + pb0Var.getMeasuredHeight();
    }
}
