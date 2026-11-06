package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
