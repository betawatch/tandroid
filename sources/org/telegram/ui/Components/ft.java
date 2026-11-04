package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ft extends Dialog {
    public final /* synthetic */ ai.c7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(ai.c7 c7Var, Context context) {
        super(context);
        this.a = c7Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        gt gtVar = (gt) this.a.b;
        gtVar.a.k(false);
        gtVar.a.e();
    }
}
