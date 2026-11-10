package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
