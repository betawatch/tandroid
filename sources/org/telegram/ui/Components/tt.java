package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tt extends Dialog {
    public final /* synthetic */ bi.e9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(bi.e9 e9Var, Context context) {
        super(context);
        this.a = e9Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ut utVar = (ut) this.a.b;
        utVar.a.k(false);
        utVar.a.e();
    }
}
