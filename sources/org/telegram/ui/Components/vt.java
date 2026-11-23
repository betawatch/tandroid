package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class vt extends Dialog {
    public final /* synthetic */ bi.b9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(bi.b9 b9Var, Context context) {
        super(context);
        this.a = b9Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        wt wtVar = (wt) this.a.b;
        wtVar.a.k(false);
        wtVar.a.e();
    }
}
