package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class au extends Dialog {
    public final /* synthetic */ eg.y1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(eg.y1 y1Var, Context context) {
        super(context);
        this.a = y1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        bu buVar = (bu) this.a.b;
        buVar.a.k(false);
        buVar.a.e();
    }
}
