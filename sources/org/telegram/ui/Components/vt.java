package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vt extends Dialog {
    public final /* synthetic */ bi.c9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(bi.c9 c9Var, Context context) {
        super(context);
        this.a = c9Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        wt wtVar = (wt) this.a.b;
        wtVar.a.k(false);
        wtVar.a.e();
    }
}
