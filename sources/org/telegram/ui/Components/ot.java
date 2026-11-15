package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ot extends Dialog {
    public final /* synthetic */ bi.t6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(bi.t6 t6Var, Context context) {
        super(context);
        this.a = t6Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        pt ptVar = (pt) this.a.b;
        ptVar.a.k(false);
        ptVar.a.e();
    }
}
