package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ik0 extends b10 {
    public final /* synthetic */ nk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik0(nk0 nk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = nk0Var;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getAdditionalHeight() {
        ob0 ob0Var;
        nk0 nk0Var = this.U;
        if (nk0Var.H.isEmpty() || (ob0Var = nk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ob0Var.getMeasuredHeight();
    }
}
