package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gt extends Dialog {
    public final /* synthetic */ bi.w4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(bi.w4 w4Var, Context context) {
        super(context);
        this.a = w4Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ht htVar = (ht) this.a.b;
        htVar.a.k(false);
        htVar.a.e();
    }
}
