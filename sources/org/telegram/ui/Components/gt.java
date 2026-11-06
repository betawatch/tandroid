package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
