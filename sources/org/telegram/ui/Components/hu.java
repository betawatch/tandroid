package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
