package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ku extends Dialog {
    public final /* synthetic */ bi.o1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(bi.o1 o1Var, Context context) {
        super(context);
        this.a = o1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        lu luVar = (lu) this.a.b;
        luVar.a.k(false);
        luVar.a.e();
    }
}
