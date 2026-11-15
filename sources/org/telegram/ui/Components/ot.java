package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
