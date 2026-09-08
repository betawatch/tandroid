package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class eu extends Dialog {
    public final /* synthetic */ bi.l3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(bi.l3 l3Var, Context context) {
        super(context);
        this.a = l3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        fu fuVar = (fu) this.a.b;
        fuVar.a.k(false);
        fuVar.a.e();
    }
}
