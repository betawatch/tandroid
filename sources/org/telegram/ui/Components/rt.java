package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rt extends Dialog {
    public final /* synthetic */ bg.i1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(bg.i1 i1Var, Context context) {
        super(context);
        this.a = i1Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        st stVar = (st) this.a.b;
        stVar.a.k(false);
        stVar.a.e();
    }
}
