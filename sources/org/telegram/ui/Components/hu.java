package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hu extends Dialog {
    public final /* synthetic */ ai.y3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(ai.y3 y3Var, Context context) {
        super(context);
        this.a = y3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        iu iuVar = (iu) this.a.b;
        iuVar.a.k(false);
        iuVar.a.e();
    }
}
